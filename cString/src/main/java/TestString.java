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
            System.out.println(new StringBuilder("S1 <").append(S1).append("> size <").append(S1.length()).append("> hashCode <").append(S1.hashCode()).append(">").toString());

            S1.getChars(4,10, S2, 0);
            S2[2] = 'B';
            System.out.println(S2);

            String S22 = new String(S2);
            StringBuilder b2 = new StringBuilder("S22 <").append(S22).append("> size<").append(S22.length()).append("> hashCode <").append(S22.hashCode()).append(">");
            System.out.println(b2.toString());

            S3[0] = 'A';
            S1.getChars(5,10, S3, 1);
            System.out.println(S3);

            String S33 = new String(S3);
            StringBuilder b3 = new StringBuilder("S33 <").append(S33).append("> size<").append(S33.length()).append("> hashCode <").append(S33.hashCode()).append(">");
            System.out.println(b3.toString());
        }
        catch(Exception e){
            System.out.println("Triggered an exception: " + e.getMessage());
        }

        System.out.println("== End");
    }
}
