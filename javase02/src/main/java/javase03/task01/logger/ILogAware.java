package javase03.task01.logger;

import javase03.task01.dataTypes.Log;

import java.io.PrintStream;

/**
 * Created by Mao Shaco on 10/22/2015.
 */
public interface ILogAware {
    void addLog(Log newLog);

    void showIntrestedLogs(Log logInfo, PrintStream outStream);
}
