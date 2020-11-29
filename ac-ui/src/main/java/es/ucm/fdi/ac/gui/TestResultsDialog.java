package es.ucm.fdi.ac.gui;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.Comparator;

import javax.swing.table.AbstractTableModel;

import es.ucm.fdi.ac.Analysis;

/**
 * Graphically displays results for a given test
 */
public class TestResultsDialog extends javax.swing.JDialog {

	private static final long serialVersionUID = -6334760287656196193L;
	private Analysis ac;
	private String testKey;

	public TestResultsDialog(java.awt.Frame parent, Analysis ac, String testKey) {
		super(parent, false);
		this.ac = ac;
		this.testKey = testKey;
		showResults();
	}

	public static class ResultTableModel extends AbstractTableModel {
		private static final long serialVersionUID = 1L;
		private Analysis.Result[] R = null;
		private String[] names = { "Distance", "One", "The other" };
		private int sortColumn = 0;

		/**
		 * Note: R must be initially sorted by first field
		 */
		public ResultTableModel(Analysis.Result[] R) {
			this.R = R;
		}

		public String getColumnName(int i) {
			return names[i];
		}

		public int getColumnCount() {
			return names.length;
		}

		public int getRowCount() {
			return R.length;
		}

		public Object getValueAt(int row, int col) {
			Analysis.Result r = R[row];
			if (col == 0)
				return r.getDist();
			else if (col == 1)
				return r.getA().getId();
			else
				return r.getB().getId();
		}

		public void sortBy(int col) {
			if (col != sortColumn) {
				sortColumn = col;
				if (col == 0) {
					Arrays.sort(R, new Comparator<Analysis.Result>() {
						public int compare(Analysis.Result a, Analysis.Result b) {
							return Float.compare(a.getDist(), b.getDist());
						}
					});
				} else if (col == 1) {
					Arrays.sort(R, new Comparator<Analysis.Result>() {
						public int compare(Analysis.Result a, Analysis.Result b) {
							return a.getA().getId().compareTo(b.getA().getId());
						}
					});
				} else {
					Arrays.sort(R, new Comparator<Analysis.Result>() {
						public int compare(Analysis.Result a, Analysis.Result b) {
							return a.getB().getId().compareTo(b.getB().getId());
						}
					});
				}
				fireTableDataChanged();
			}
		}

		public Analysis.Result getResultAt(int row) {
			return R[row];
		}
	}

	public void showResults() {
		Analysis.Result[] R = ac.sortTestResults(testKey);
		Charset charset = Charset.forName("US-ASCII");
		for (int i = 0; i < R.length; i++) {
			String s = R[i].getA() + " - " + R[i].getB() + ": " + R[i].getDist();
			Path resultFile = Paths.get("C:\\Users\\Admin\\Downloads\\Result" + "\\"
					+ R[i].getA().toString().substring(0, R[i].getA().toString().indexOf("_")) + ".txt");
			if (Files.notExists(resultFile)) {
				try {
					Files.createFile(resultFile);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			try (BufferedWriter writer = Files.newBufferedWriter(resultFile, charset, StandardOpenOption.APPEND)) {
				writer.write(s + "\n");
			} catch (IOException e) {
			}
		}
	}
}
