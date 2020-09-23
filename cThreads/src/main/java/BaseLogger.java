package main.java;

/**
 * Created by ding_ on 9/23/2020
 */

// Not sure if it is thread-safe
class BaseLogger {
    private static BaseLogger log = new BaseLogger();
    private BaseLogger(){};
    public static BaseLogger getInstance(){ return log; }
    private StringBuilder logMessage = new StringBuilder();
    //private StringBuffer logMessage = new StringBuffer();
    public synchronized void addLog(String message){ logMessage.append(message + "|"); }
    public void printLog(){ System.out.println(logMessage.toString()); }
}
