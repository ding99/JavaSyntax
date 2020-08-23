package main.java;

/**
 * Created by dingw on 5/31/2019.
 */

public class Entry {

    public static void main(String[] arg){
        System.out.println("== Start");

        new Action().work();

        new PracticeNest().Start();
        new PracticeConstructor().Start();
        new OOPer().Start();

        System.out.println("== End");
    }

}
