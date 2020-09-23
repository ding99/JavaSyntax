package main.java;

/**
 * Created by ding_ on 9/23/2020
 */
public class Entrance {
    public static void main(String[] args){
        System.out.println("== Module Multi Threads : Start");

        try { Concurrency.Start(); }
        catch (InterruptedException e){ System.out.println("Error: " + e.getMessage()); }

        new UseLogger().Using();

        System.out.println("== End");
    }
}
