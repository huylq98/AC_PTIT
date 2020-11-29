package es.ucm.fdi.ac.gui;

import es.ucm.fdi.ac.Analysis;
import es.ucm.fdi.ac.Main;
import es.ucm.fdi.ac.test.Test;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintWriter;
import java.time.Duration;
import java.time.Instant;

import javax.swing.JDialog;
import static es.ucm.fdi.util.I18N.m;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;

public class GraphicalAnalysis extends JDialog implements ActionListener {

	private static final long serialVersionUID = 5764196964541484060L;

	private static final Logger log = LogManager.getLogger(GraphicalAnalysis.class);

	private javax.swing.Timer t;
	private Test test;
	private String testName;
	private Analysis ac;
	private Runnable callback;
	private long startTime;
	private boolean isTestFinished = false;

	public GraphicalAnalysis(Analysis ac, String testName, Test test, Runnable callback) {
		this.ac = ac;
		this.callback = callback;
		this.testName = testName;
		this.test = test;
	}

	void start() {
		TestRunner runner = new TestRunner();
		Thread testThread = new Thread(runner);
		testThread.start();
		startTime = System.currentTimeMillis();
		t = new javax.swing.Timer(1000, this); // miliseconds
		t.setRepeats(true);
		t.start();
	}

	private class TestRunner implements Runnable {
		public void run() {
			try {
				ThreadContext.push("T-" + test);
				ac.prepareTest(test);
				java.awt.EventQueue.invokeLater(new Runnable() {
					public void run() {
						setTitle(testName + ": " + m("Analysis.Comparing"));
					}
				});

				ac.applyTest(test);
				isTestFinished = true;
				ThreadContext.pop();
			} catch (RuntimeException e) {
				java.io.StringWriter sw = new java.io.StringWriter();
				e.printStackTrace(new PrintWriter(sw));
				java.awt.EventQueue.invokeLater(new Runnable() {
					public void run() {
						dispose();
					}
				});
			}
		}
	}

	public void actionPerformed(ActionEvent evt) {
		long elapsed = System.currentTimeMillis() - startTime;
		if (isTestFinished) {
			t.stop();
			log.info("Total time elapsed: " + elapsed + " ms");
			log.info("Total time: " + Duration.between(Main.start, Instant.now()).toMillis() + "ms");
			callback.run();
		}
	}
}
