package main.java;

/**
 * Created by ding_ on 9/22/2020
 */

public class Entrance {
    public static void main(String[] args){
        Xix x = new Xix();
        x.method2();
        x.method();

        new PracticeTime().Start();
        new Wrapping().Start();
        new Keywords().Start();

        Operation op = new Operation();
        op.Casting();

        PrivateVariable.Start();
        Gen.Start();

        new Reducing().ExamineReduce();
    }
}
