package main.java;

import java.util.function.Predicate;

/**
 * Created by ding_ on 9/23/2020
 */

public class UsePredicate {
    private boolean testit(Object s, Predicate<Object> p){
        return p.test(s);
    }

    public void Start(){
        System.out.print("<Examining Predicate>");
        final String s1 = "HI";
        final Integer i1 = 3;
        final int x = 1;
        ExaminePredicate<Object>[] p = new ExaminePredicate[4];
        p[0] = new ExaminePredicate<>(e -> e.equals(s1));
        p[1] = new ExaminePredicate<>(e -> {if(x==1) return e.equals(s1); return !e.equals(s1);});
        p[2] = new ExaminePredicate<>(e -> {if(x!=1) return e.equals(i1); return !e.equals(s1);});
        p[3] = new ExaminePredicate<>((Object e) -> {if(x!=1) return e.equals(i1); return !e.equals(s1);});
        for(ExaminePredicate<Object> pp : p) System.out.print(" " + testit(s1,pp));
        System.out.println();
    }

    /** result: <Examining Predicate> true true false false **/
}
