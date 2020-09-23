package main.java;

/**
 * Created by ding_ on 9/23/2020
 */

import java.util.function.Predicate;

public class ExaminePredicate<T> implements Predicate<T> {
    Predicate<T> local;
    ExaminePredicate(Predicate<T> t){ local = t; }
    @Override public boolean test(T t){ return local.test(t); }
}
