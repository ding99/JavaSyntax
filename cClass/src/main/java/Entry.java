package main.java;

/**
 * Created by dingw on 5/31/2019.
 */

public class Entry {

    public static void main(String[] arg){
        System.out.println("== Start");
        new Action().work();

        new PracticeNest().Start();

        System.out.println("=> Practice constructor");
        PracticeConstructor pc = new PracticeConstructor(2,2);
        pc.Display();

        new OOPer().Start();

        System.out.println("== End");
    }

}
