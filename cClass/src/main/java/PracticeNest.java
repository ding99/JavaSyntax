package main.java;

/**
 * Created by dingw on 8/23/2020.
 */

public class PracticeNest {
    void Start(){
        System.out.println("=> Practice default access modifier");

        System.out.println("-> Static inner class");
        OuterClass.InnerClass inter = new OuterClass.InnerClass();
        System.out.println("Start-Inner Class: (" + inter.y + ")");
        OuterClass outer = new OuterClass();
        System.out.println("Start-Outer Class: (" + outer.x + "," + inter.y + ")");

        System.out.println("-> Non-static inner class");
        Outer2Class outer2 = new Outer2Class();
        Outer2Class.Inner2Class inter2 = outer2.new Inner2Class();
        System.out.println("Start-Outer Class: (" + outer2.x + "," + inter2.y + ")");
    }
}
