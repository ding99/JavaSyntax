package main.java;

/**
 * Created by ding_ on 9/23/2020
 */

public class Gen<T> {
    private T t;
    public Gen(T t){ this.t = t; }
    public T getT(){ return t; }
    public void setT(T t){ this.t = t; }

    public void showType(){
        System.out.println("The actual type of T is: " + t.getClass().getName());
    }

    public static void Start(){
        Gen<Integer> gen = new Gen<>(1);
        gen.showType();
        int i = gen.getT();
        System.out.println(" value = <" + i + ">");

        System.out.println("--------------------");

        Gen<String> str = new Gen<>("Hello Gen");
        str.showType();
        String s = str.getT();
        System.out.println(" value = <" + s + ">");
    }
}
