package main.java;

/**
 * Created by ding_ on 9/23/2020
 */
public class UseLogger {
    public void UseBase() {
        System.out.println("-- Use Base logger");

        BaseLogger logger = BaseLogger.getInstance();
        logger.addLog("MSG01");
        logger.addLog("Speak02");
        logger.addLog("MSG03");
        logger.printLog();
    }

    public void UseTest() {
        System.out.println("-- Use Test logger");

        TestLogger logger = new TestLogger();
        logger.log("MSG01");
        logger.log("Speak02");
        logger.log("MSG03");
        System.out.println(logger.getContents());
    }
}
