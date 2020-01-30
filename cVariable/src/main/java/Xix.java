package main.java;

public class Xix {
    public static String str = "static member";
    public String str2  ="non-static member";

    public static void method(){
        str = "sss";
        System.out.println("This is a static method not relative with any object");
    }

    public void method2(){
        str = "sss_sss01";
        str2 = "sss_sss02";
        method();
        System.out.println("This is a non-static method.");
    }

    public static void main(String[] args){
        Xix x = new Xix();
        x.method2();
        x.method();
    }
}
