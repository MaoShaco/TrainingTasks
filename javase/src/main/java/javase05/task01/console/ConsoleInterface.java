package javase05.task01.console;

import javase05.task01.fileManager.FileManager;

import java.util.Scanner;

/**
 * Created by Mao Shaco on 11/6/2015.
 */
public class ConsoleInterface {
    private final int commandSize = 3;

    public void run() {

        final FileManager fileManager = new FileManager();


        while (true) {
            System.out.print(fileManager.getCurrentPath() + ">");
            try {
                Scanner in = new Scanner(System.in);
                String buff = in.nextLine();

                if (buff.length() > commandSize - 1)
                    switch (buff.substring(0, commandSize)) {
                        case "hlp": {
                            System.out.println(fileManager.showCommands());
                            break;
                        }
                        case "ccd": {
                            fileManager.changeCurrentDirectory(buff.replaceFirst("ccd ", ""));
                            break;
                        }
                        case "lsf": {
                            System.out.println(fileManager.listFiles());
                            break;
                        }
                        case "ctf": {
                            System.out.println(fileManager.createTextFile(buff.replaceFirst("ctf ", "")));
                            break;
                        }
                        case "stf": {
                            System.out.println(fileManager.showTextFile(buff.replaceFirst("stf ", "")));
                            break;
                        }
                        case "cdr": {
                            System.out.println(fileManager.createDirectory(buff.replaceFirst("cdr ", "")));
                            break;
                        }
                        case "app": {
                            System.out.println("Input text which have to be appended");
                            System.out.println(fileManager.appendTextToFile(buff.replaceFirst("app ", ""), in.nextLine()));
                            break;
                        }
                        case "del": {
                            System.out.println(fileManager.deleteFileOrDirectory(buff.replaceFirst("del ", "")));
                            break;
                        }
                        case "ext": {
                            return;
                        }
                        default:
                            System.out.println(String.format("'%s' is not recognized as command", buff));
                    }
                else
                    System.out.println(String.format("'%s' is not recognized as command", buff));

            } catch (RuntimeException e) {
                System.out.println("Something goes wrong in operation with files\nReason: " + e.getLocalizedMessage());
            } catch (Exception e) {
                System.out.println("Something goes wrong critical exception\nReason: " + e.getLocalizedMessage());
            }
        }
    }
}