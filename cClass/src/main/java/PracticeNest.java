package main.java;

/**
 * Created by dingw on 8/23/2020.
 */

public class PracticeNest {
    void Start(){
        System.out.println("=> Practice default access modifier");

        OuterClass.InnerClass inter = new OuterClass.InnerClass();
        System.out.println("Start-Inner Class: (" + inter.y + ")");

        OuterClass outer = new OuterClass();
        System.out.println("Start-Outer Class: (" + outer.x + "," + inter.y + ")");
    }
}
