package javase03.task01;

import javase03.task01.dataTypes.DateMessageType;
import javase03.task01.dataTypes.Log;
import javase03.task01.logger.CrazyLogger;
import javase03.task01.logger.ILogAware;

/**
 * Created by Mao Shaco on 10/22/2015.
 */
public class CrazyLoggerInspector {
    public static void main(String[] args) {

        ILogAware crazyLogger = new CrazyLogger();

        crazyLogger.addLog(new Log<String>("12-11-0000 : 23-20 - game over"));
        crazyLogger.addLog(new Log<String>("31-02-1991 : 09-20 - game "));
        crazyLogger.addLog(new Log<String>("29-14-2060 : 13-20 - gam"));

        crazyLogger.showIntrestedLogs(new Log<String>("gam"), System.out);
        ILogAware cL = new CrazyLogger();

        cL.addLog(new Log<DateMessageType>(new DateMessageType("12-11-0000 : 23-20", "game over")));
        cL.addLog(new Log<DateMessageType>(new DateMessageType("31-02-1991 : 09-20", "game ")));
        cL.addLog(new Log<DateMessageType>(new DateMessageType("29-10-2060 : 13-20", "gam")));

        cL.showIntrestedLogs(new Log("game o"), System.out);
        cL.showIntrestedLogs(new Log<String>("game"), System.out);
        cL.showIntrestedLogs(new Log<DateMessageType>(new DateMessageType("gam")), System.out);
    }
}
