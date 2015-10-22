package javase03.task01;

import javase03.task01.dataTypes.DateMessageType;
import javase03.task01.dataTypes.Log;
import javase03.task01.logger.CrazyLogger;
import javase03.task01.logger.ILogAware;

import java.util.Arrays;

/**
 * Created by Mao Shaco on 10/22/2015.
 */
public class CrazyLoggerInspector {
    public static void main(String[] args) {

        ILogAware crazyLogger = new CrazyLogger();

        crazyLogger.addLog(new Log<String>("12-11-0000 : 23-20 - game over"));
        crazyLogger.addLog(new Log<String>("31-02-1991 : 09-20 - game "));
        crazyLogger.addLog(new Log<String>("29-14-2060 : 13-20 - gam"));

        System.out.println(Arrays.toString(crazyLogger.findLogs(new Log<String>("gam"))));

        ILogAware cL = new CrazyLogger();

        cL.addLog(new Log<DateMessageType>(new DateMessageType("12-11-0000 : 23-20", "game over")));
        cL.addLog(new Log<DateMessageType>(new DateMessageType("31-02-1991 : 09-20", "game ")));
        cL.addLog(new Log<DateMessageType>(new DateMessageType("29-10-2060 : 13-20", "gam")));

        //System.out.println(Arrays.toString(cL.findLogs(new Log(("game o")))));
        System.out.println(Arrays.toString(cL.findLogs(new Log<String>("game"))));
        System.out.println(Arrays.toString(cL.findLogs(new Log<DateMessageType>(new DateMessageType("gam")))));
    }
}
