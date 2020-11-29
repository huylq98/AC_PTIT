package es.ucm.fdi.ac.gui;

import es.ucm.fdi.ac.Analysis;
import es.ucm.fdi.ac.SourceSet;

import es.ucm.fdi.ac.parser.AntlrTokenizerFactory;
import es.ucm.fdi.ac.test.Test;
import es.ucm.fdi.ac.test.TokenizingTest;
import java.io.File;
import java.util.*;
import javax.swing.*;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class MainGui extends JPanel {

	private static final long serialVersionUID = 2147419059564356036L;

	private static final Logger log = LogManager.getLogger(MainGui.class);

	private Analysis ac;
	private GraphicalAnalysis analysis;

	private HashMap<String, TestResultsDialog> testResults;

	public MainGui() {
		testResults = new HashMap<>();
		ac = new Analysis();
		Analysis.setTokenizerFactory(new AntlrTokenizerFactory());
	}

	public void launchTest(Test t, boolean suggestThresholds) {
		if (ac == null) {
			return;
		}

		if (ac.hasResultsForKey(t.getTestKey())) {
			showResults(t.getTestKey());
			return;
		}

		try {
			log.info("Starting test " + t);
			if (t instanceof TokenizingTest) {
				((TokenizingTest) t).setTokenizer(ac.chooseTokenizer());
			}
			// launch test
			String tcn = t.getClass().getName();
			String tn = tcn.substring(tcn.lastIndexOf('.') + 1);
			analysis = new GraphicalAnalysis(ac, tn, t, new ShowResultsCallback(t));
			analysis.start();
		} catch (Exception e) {
			System.err.println(e);
		}
	}

	private class ShowResultsCallback implements Runnable {
		private Test t;

		public ShowResultsCallback(Test t) {
			this.t = t;
		}

		public void run() {
			showResults(t.getTestKey());
		}
	}

	public void loadSources(File d) {
		if (d != null) {
			SourceSet ss = new SourceSet(d);
			loadSources(ss);
		}
	}

	public void loadSources(SourceSet ss) {
		try {
			ac.loadSources(ss);
			clearAllResults();
		} catch (Exception e) {
			System.err.println(e);
		}
	}

	public void showResults(String testKey) {
		TestResultsDialog trd = (TestResultsDialog) testResults.get(testKey);
		if (trd == null) {
			trd = new TestResultsDialog(null, ac, testKey);
			testResults.put(testKey, trd);
		}
		trd.showResults();
	}

	public void clearAllResults() {
		testResults.clear();
	}
}
