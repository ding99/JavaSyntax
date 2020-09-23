package main.java;

/**
 * Created by ding_ on 9/23/2020
 */

class BaseLogger {
    private static BaseLogger log = new BaseLogger();
    private BaseLogger(){};
    public synchronized static BaseLogger getInstance(){ return log; }
    private StringBuilder logMessage = new StringBuilder();
    public void addLog(String message){ logMessage.append(message + "|"); }
    public void printLog(){ System.out.println(logMessage.toString()); }
}
