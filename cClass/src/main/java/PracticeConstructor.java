package main.java;

public class PracticeConstructor {
    int x = 1, y = 2;

    PracticeConstructor(int initX, int initY){
        x = initX; y = initY;
    }

    void Display(){
        System.out.println("x " + x + ", y " + y);
        System.out.println(String.format("Use format(): x %d, y %d", x, y));
    }
}
