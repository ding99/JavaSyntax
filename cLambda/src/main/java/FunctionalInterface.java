package main.java;

/**
 * Created by ding_ on 9/21/2020
 */

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FunctionalInterface {
    public void Start(){
        System.out.println("-- Functional Interface (Predicate)");

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        eval("All numbers", list, n -> true);
        eval("All even", list, n -> n%2 == 0);
        eval("Larger than 3", list, n -> n > 3);

        System.out.print("<Using filter> ");
        list.stream().filter(n -> n > 3).forEach(System.out::print);
        System.out.println();
    }

    private void eval(String title, List<Integer> list, Predicate<Integer> preficate){
        System.out.print("<" + title + "> [");
        for(Integer n : list){
            if(preficate.test(n)){
                System.out.print(" " + n);
            }
        }
        System.out.println(" ]");
    }
}
