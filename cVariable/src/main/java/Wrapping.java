package main.java;

/**
 * Created by ding_ on 9/20/2020
 */

public class Wrapping {
    public void Start(){
        System.out.println("-- Wrapper");
        Integer wInt = 5;
        Double wDouble = 5.99;
        Character wChar = 'A';
        System.out.println("wInt <" + wInt + "> wDouble <" + wDouble + "> wChar <" + wChar + ">");

        int pInt = wInt.intValue();
        double pDouble = wDouble.doubleValue();
        char pChar = wChar.charValue();
        System.out.println("pInt <" + pInt + "> pDouble <" + pDouble + "> pChar <" + pChar + ">");
    }
}
