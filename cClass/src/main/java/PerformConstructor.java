package main.java;

/**
 * Created by dingw on 8/23/2020.
 */

public class PerformConstructor {
    int x = 1, y = 2;

    PerformConstructor(int initX, int initY){
        x = initX; y = initY;
    }

    void Display(){
        System.out.println("By PLUS operator: x " + x + ", y " + y);
        System.out.println(String.format("By String format: x %d, y %d", x, y));
    }
}
