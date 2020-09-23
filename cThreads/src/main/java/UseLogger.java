package main.java;

/**
 * Created by ding_ on 9/23/2020
 */
public class UseLogger {
    public void Using() {
        System.out.println("-- Use Base logger");

        BaseLogger logger = BaseLogger.getInstance();
        logger.addLog("MSG01");
        logger.addLog("Speak02");
        logger.addLog("MSG03");
        logger.printLog();
    }
}
