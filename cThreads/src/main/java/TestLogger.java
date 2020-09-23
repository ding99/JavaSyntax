package main.java;

/**
 * Created by ding_ on 9/23/2020
 */

public class TestLogger {
    private StringBuilder contents = new StringBuilder();
    public void log(String message){
        contents.append("<").append(System.currentTimeMillis()).append("-");
        contents.append(Thread.currentThread().getName()).append("-");
        contents.append(message).append(">");
    }
    public String getContents(){ return contents.toString(); }
}
