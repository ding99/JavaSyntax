package main.java;

/**
 * Created by ding_ on 9/22/2020
 */
public class Son extends Parent {
    void GFG(){
        System.out.println("a = " + a + ", x = " + x);

        super.a = 1;
        x = 60.3f;
        System.out.println("a = " + a + ", x = " + super.x);
    }
}
