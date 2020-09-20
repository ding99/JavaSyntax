package main.java;

/**
 * Created by ding_ on 9/20/2020
 */
public class TestString {
    public static void main(String[] args){
        System.out.println("== Start");

        String S1 = new String("www.runoob.com");
        char[] S2 = new char[6];
        char[] S3 = new char[6];

        try{
            System.out.println("S1: <" + S1 + "> size " + S1.length());

            S1.getChars(4,10, S2, 0);
            S2[2] = 'B';
            System.out.println(S2);

            S3[0] = 'A';
            S1.getChars(5,10, S3, 1);
            System.out.println(S3);
        }
        catch(Exception e){
            System.out.println("Triggered an exception: " + e.getMessage());
        }

        System.out.println("== End");
    }
}
