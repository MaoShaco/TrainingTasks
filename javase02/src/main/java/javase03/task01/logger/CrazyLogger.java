package javase03.task01.logger;

import javase03.task01.dataTypes.Log;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Mao Shaco on 10/22/2015.
 */
public class CrazyLogger implements ILogAware {
    private StringBuilder dataBase;
    private static final char delimiter = '\n';
    List<Log> rightLogs;

    public CrazyLogger() {
        this.dataBase = new StringBuilder();
    }

    public void addLog(Log newLog) {

        this.dataBase.append(newLog.getLogField().toString() + delimiter);
    }

    public void showIntrestedLogs(Log logInfo, PrintStream outStream){
        System.out.println(Arrays.toString(this.findLogs(logInfo)));
    }
    private Object[] findLogs(Log logInfo) {
        rightLogs = new ArrayList<Log>();
        findRecursively(logInfo, 0);
        return rightLogs.toArray();
    }

    private void findRecursively(Log logInfo, int lastPosition) {
        int position = dataBase.indexOf(logInfo.getLogField().toString(), lastPosition);
        if (position != -1) {

            int start = dataBase.lastIndexOf(String.valueOf(delimiter), position);
            int end = dataBase.indexOf(String.valueOf(delimiter), position);

            rightLogs.add(new Log<String>(dataBase.substring(start + 1, end)));
            findRecursively(logInfo, end);
        }
    }
}
