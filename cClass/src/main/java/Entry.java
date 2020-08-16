package main.java;

/**
 * Created by dingw on 5/31/2019.
 */

public class Entry {

    public static void main(String[] arg){
        System.out.println("== Start");
        new Action().work();

        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inter = new OuterClass.InnerClass();
        System.out.println("Start-Inner Class: (" + outer.x + "," + inter.y + ")");

        System.out.println("== End");
    }

}
