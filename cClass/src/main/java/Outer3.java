package main.java;

/**
 * Created by ding_ on 9/22/2020
 */

public class Outer3 {
    private class Inner3{ private int x = 10; }
    void print(){ Inner3 inner = new Inner3(); System.out.println(inner.x); }
}
