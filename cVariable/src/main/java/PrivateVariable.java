package main.java;

/**
 * Created by ding_ on 9/23/2020
 */
public class PrivateVariable {
    public PrivateVariable(){ this(10); }
    public PrivateVariable(int data){ this.data = data;}
    public void display(){
        class Decrementer{
            public void decrement(){ data--; }
        }
        Decrementer d = new Decrementer();
        d.decrement();
        System.out.println("data = " + data);
    }

    private int data;

    public static void Start(){
        System.out.println("-- Private variable");
        int data = 0;
        PrivateVariable t = new PrivateVariable();
        t.display();
        System.out.println("data = " + data);
    }
}
