package main.java;

/**
 * Created by ding_ on 9/21/2020
 */

public class LambdaBasic {
    public static void Operator() {
        LambdaBasic tester = new LambdaBasic();
        MathOperation addition = (int a, int b) -> a + b;
        MathOperation subtraction = (a, b) -> a - b;
        MathOperation multiplication = (int a, int b) -> { return a * b; };
        MathOperation division = (a, b) -> a / b;

        System.out.println("10 + 5 = " + tester.operate(10,5, addition));
        System.out.println("10 - 5 = " + tester.operate(10,5, subtraction));
        System.out.println("10 x 5 = " + tester.operate(10,5, multiplication));
        System.out.println("10 / 5 = " + tester.operate(10,5, division));

        Greeting service1 = message -> System.out.println("Hello " + message);
        Greeting service2 = (message) -> System.out.println("Hi " + message);
        Greeting service3 = (String message) -> { System.out.println("Hey " + message); };

        service1.sayMessage("Baidu");
        service2.sayMessage("Google");
        service3.sayMessage("Yahoo");
    }
    private int operate(int a, int b, MathOperation mathOperation){
        return mathOperation.operation(a, b);
    }
    interface MathOperation { int operation(int a, int b); }
    interface Greeting { void sayMessage(String message); }
}
