package main.java;

public class Xix {
    public static String str = "static member";
    public String str2  ="non-static member";

    public static void method(){
        //str = "sss";
        System.out.println("This is a static method not relative with any object. str [" + str + "]");
    }

    public void method2(){
        str = "sss_sss01";
        str2 = "sss_sss02";
        method();
        System.out.println("This is a non-static method. str [" + str + "] str2 [" + str2 + "]");
    }
}
