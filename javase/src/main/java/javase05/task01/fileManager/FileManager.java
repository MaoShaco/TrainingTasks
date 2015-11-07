package javase05.task01.fileManager;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.Comparator;


public class FileManager {
    private String currentPath;
    private File currentFile;

    public String getCurrentPath() {
        return currentFile.getPath();
    }

    public FileManager() {
        this(Paths.get("").toAbsolutePath().toString());
    }

    public FileManager(String currentPath) {
        this.currentFile = new File(currentPath);
    }

    private String getPathDependOnCurrent(String path) {
        return ((Paths.get(path).isAbsolute()) ? path : String.format("%s/%s", getCurrentPath(), path));
    }

    public String changeCurrentDirectory(String path) {

        if (path.equals("..") && currentFile.getParent() != null) {
            currentFile = currentFile.getParentFile();
            return "Directory parented";
        }

        File buffFile = new File(getPathDependOnCurrent(path));

        if (buffFile.exists()) {
            if (buffFile.isDirectory()) {
                currentFile = buffFile;
                return "Directory changed";
            }
            return "The Directory name is invalid";
        }
        return "The system cannot find the path specified";
    }

    public String listFiles() {

        File[] listOfFiles = currentFile.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return !pathname.isHidden();
            }
        });

        Arrays.sort(listOfFiles, new Comparator<File>() {
            @Override
            public int compare(File o1, File o2) {
                if (o1.isDirectory() && o2.isDirectory() || o1.isFile() && o2.isFile()) {
                    return o1.compareTo(o2);
                }
                if (o2.isDirectory())
                    return 1;
                return -1;
            }
        });

        StringBuilder files = new StringBuilder();
        for (File fileName : listOfFiles) {
            files.append(String.format("%s\n", fileName.getName()));
        }

        return files.toString();
    }

    public String createTextFile(String fileName) {
        fileName += ".txt";
        try {
            File file = new File(getPathDependOnCurrent(fileName));
            return String.format("File <%s>%s created", file.getName(), file.createNewFile() ? "" : " (already exist) not");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String appendTextToFile(String fileName, String data) {
        fileName += ".txt";
        String path = (getPathDependOnCurrent(fileName));

        try (BufferedWriter bw = Files.newBufferedWriter(Paths.get(path), StandardOpenOption.APPEND)) {
            bw.write(data);

            return String.format("Text appended to the file <%s>", fileName);

        } catch (IOException e) {
            return String.format("Text not appended to the file <%s>\nReason: %s", fileName, e.getLocalizedMessage());
        }
    }

    public String deleteFileOrDirectory(String fileName) {
        File file = new File(getPathDependOnCurrent(fileName));

        try {
            if (file.exists()) {

                FileUtils.forceDelete(file);
                return String.format("File/Directory <%s> deleted successfully", file.getName());
            }
            return String.format("File/Directory <%s> do not exist", file.getName());

        } catch (IOException e) {
            return String.format("File/Directory <%s> not deleted\nReason: %s", file.getName(), e.getLocalizedMessage());
        }
    }

    public String createDirectory(String directoryName) {
        File file = new File(getPathDependOnCurrent(directoryName));
        return String.format("File <%s>%s created", file.getName(), file.mkdir() ? "" : " not");
    }

    public String showTextFile(String fileName) {
        String path = (getPathDependOnCurrent(fileName));

        try (InputStream in = new FileInputStream(path)) {
            return IOUtils.toString(in);
        } catch (IOException e) {
            return String.format("Cannot read <%s>\nReason: %s", fileName, e.getLocalizedMessage());
        }
    }

    public String showCommands() {
        return "hlp - list of commands\n" +
                "ccd - change current directory\n" +
                "lsf - list files in current directory\n" +
                "ctf - create text file\n" +
                "cdr - create directory\n" +
                "app - append text to file\n" +
                "del - delete directory/file\n" +
                "stf - show text file";
    }

}