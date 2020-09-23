package main.java;

/**
 * Created by ding_ on 9/23/2020
 */

import java.util.function.Supplier;
import java.util.function.Consumer;

public class ExamineSupplier {
    public void Start(){
        System.out.println("-- Examining Supplier");
        Supplier<String> i = () -> "Car";
        Consumer<String> c = x -> System.out.print(x.toLowerCase());
        Consumer<String> d = x -> System.out.print(x.toUpperCase());
        c.andThen(d).accept(i.get());
        System.out.println();
    }
    /** carCAR **/
}
