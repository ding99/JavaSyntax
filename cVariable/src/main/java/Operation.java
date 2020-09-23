package main.java;

/**
 * Created by ding_ on 9/22/2020
 */
public class Operation {
    public void Casting(){
        int a = 9, b = 2;
        System.out.println("-- Widening Casting. integer a = " + a + ", b = " + b);
        float f;
        f = a / b;
        System.out.println("f = " + f);
        f = f / 2;
        System.out.println("f = " + f);
        f = a + b / f;
        System.out.println("f = " + f);
    }
}
