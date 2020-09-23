package main.java;

import java.util.Arrays;
import java.util.List;

/**
 * Created by ding_ on 9/23/2020
 */
public class Reducing {
    public void ExamineReduce(){
        List<String> list = Arrays.asList("dog", "over", "good");

        System.out.print(list.stream().reduce(new String(),(s1,s2) -> s1 + s2.charAt(0),(c1,c2) -> c1 += c2));
        System.out.println(" (" + list.stream().reduce(new String(),(s1,s2) -> s1 + s2.charAt(0)) + ")");

        System.out.println(list.stream().reduce(new String(), (x1,x2) -> {if(x1.equals("dog")) return x1;return x2;}));

        list.stream().reduce((x1,x2) -> x1.length() > x2.length() ? x1:x2).ifPresent(System.out::println);

        list.stream().reduce((x1,x2) -> x1.length() == 3 ? x1:x2).ifPresent(System.out::println);

        //System.out.println(list.stream().reduce(new Character(),(Character s1,s2) -> s1 + s2.charAt(0),(c1,c2) -> c1 += c2));
    }

    /** result:
     * dog (dog)
     * dog
     * good
     * dog
     */
}
