package main.java;

/**
 * Created by ding_ on 9/20/2020
 */

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Lists {

    public void Start(){
        AList();
        LinkList();
    }

    private void LinkList(){
        System.out.println("-- LinkedList");
        LinkedList<String> cars = new LinkedList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        System.out.println("first <" + cars.getFirst() + "> last <" + cars.getLast() + ">");
        Collections.sort(cars);
        System.out.println("first <" + cars.getFirst() + "> last <" + cars.getLast() + ">");
    }

    private void AList(){
        System.out.println("-- ArrayList");
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        Collections.sort(cars);
        System.out.println(cars);
    }
}
