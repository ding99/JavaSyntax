package main.java;

/**
 * Created by ding_ on 9/20/2020
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.HashMap;

public class Lists {

    public void Start(){
        AList();
        LinkList();
        HMap();
    }

    private void HMap(){
        System.out.println("-- HashMap");
        HashMap<String,String> cities = new HashMap<>();
        cities.put("England","London");
        cities.put("Germany","Berlin");
        cities.put("Norway","London");
        cities.put("USA","Washington DC");
        System.out.println(cities + ", size " + cities.size());
        System.out.println("Norway <" + cities.get("Norway") + ">");
        cities.remove("Germany");
        System.out.println(cities + ", size " + cities.size());

        for(String i : cities.keySet())
            System.out.println("  <" + i + "> value <" + cities.get(i) + ">");
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
