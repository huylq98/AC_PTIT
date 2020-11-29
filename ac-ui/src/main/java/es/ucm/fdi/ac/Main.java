package es.ucm.fdi.ac;

import static java.nio.file.FileVisitResult.*;
import static java.nio.file.StandardCopyOption.*;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.Duration;
import java.time.Instant;
import java.util.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import es.ucm.fdi.ac.extract.ZipSelectionPanel;
import es.ucm.fdi.ac.gui.MainGui;
import es.ucm.fdi.ac.test.NCDTest;
import es.ucm.fdi.util.I18N;
import es.ucm.fdi.util.archive.ZipFormat;

public class Main {

	private static final Logger log = LogManager.getLogger(Main.class);

	private static MainGui main;
	public static Path startingDir;
	private static List<Path> allDir;
	public static Instant start;

	public static void main(String args[]) {
		I18N.setLang(Locale.getDefault().getLanguage());
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				start = Instant.now();
				allDir = new ArrayList<>();
				try {
					filterFile("C:\\Users\\Admin\\Downloads\\101", "*.cpp");
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				allDir.forEach(f -> {
					main = new MainGui();
					ZipSelectionPanel zsp = new ZipSelectionPanel();
					zsp.addSourceFile(f.toFile());
					zsp.filterPanel.addExpression(f.getFileName().toString() + "_B");
					zsp.filterPanel.confirm();
					ZipSelectionPanel.analyze();
					main.launchTest(new NCDTest(new ZipFormat()), true);
				});
				log.info("Total time: " + Duration.between(start, Instant.now()).toMillis() + "ms");
			}
		});
	}

	public static void selectionConfirmed(SourceSet ss) {
		main.loadSources(ss);
	}

	public static void filterFile(String sourcePath, String pattern) throws IOException {
		startingDir = Paths.get(sourcePath);
		Finder finder = new Finder("C:\\Users\\Admin\\OneDrive\\Desktop\\Test", pattern);
		Files.walkFileTree(startingDir, finder);
	}

	private static class Finder extends SimpleFileVisitor<Path> {

		private final Path savedPath;
		private final PathMatcher matcher;

		Finder(String path, String pattern) {
			savedPath = Paths.get(path);
			matcher = FileSystems.getDefault().getPathMatcher("glob:" + pattern);
		}

		void find(Path subFile) throws IOException {
			if (subFile != null && matcher.matches(subFile.getFileName())) {
				StringBuilder savedLocation = new StringBuilder(savedPath.toString());
				savedLocation.append("\\").append(
						subFile.getFileName().toString().substring(0, subFile.getFileName().toString().indexOf("_")));
				Path separateDirForID = Paths.get(savedLocation.toString());
				if (!allDir.contains(separateDirForID)) {
					Files.createDirectories(separateDirForID);
					log.info("Create folder " + separateDirForID);
					allDir.add(separateDirForID);
				}

				StringBuilder copyInfo = new StringBuilder("Copy ");
				log.info(copyInfo.append(subFile).append(" to ").append(separateDirForID));
				Files.copy(subFile, Paths.get(separateDirForID.toString() + "\\" + subFile.getFileName()),
						REPLACE_EXISTING);
			}
		}

		@Override
		public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
			find(file);
			return CONTINUE;
		}

		@Override
		public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
			find(dir);
			return CONTINUE;
		}
	}
}
