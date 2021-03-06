package main.java;

/**
 * Created by ding_ on 9/20/2020
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Lists {

    public void Start(){
        AList();
        LinkList();
        HMap();
        HSet();
    }

    private void HSet() {
        System.out.println("-- HashSet");
        HashSet<String> cars = new HashSet<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("BMW");
        System.out.println(cars + " size " + cars.size());
        System.out.println("Containing <Ford>: " + cars.contains("Ford") + ", Containing <Toyota>: " + cars.contains("Toyota"));
    }

    private void HMap(){
        System.out.println("-- HashMap");
        HashMap<String,String> cities = new HashMap<>();
        cities.put("England","London");
        cities.put("Germany","Berlin");
        cities.put("Norway","London");
        cities.put("USA","Washington DC");
        System.out.println(cities + " size " + cities.size());
        System.out.println("get: Norway <" + cities.get("Norway") + ">, then remove Germany");
        cities.remove("Germany");
        System.out.println(cities + " size " + cities.size());
        System.out.print("Cities:");
        for(String i : cities.keySet())
            System.out.print(" <" + i + ">/<" + cities.get(i) + ">");
        System.out.println();

        HashMap<String, Integer> ages = new HashMap<>();
        ages.put("John", 32);
        ages.put("Mike", 36);
        ages.put("Mark", 28);
        System.out.println(ages + " size " + ages.size());
        System.out.print("Keys:");
        for(String i : ages.keySet())
            System.out.print("  <" + i + ">");
        System.out.println();
        System.out.print("Values:");
        for(Integer i : ages.values())
            System.out.print("  <" + i + ">");
        System.out.println();
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
        cars.add("BMW");
        System.out.println(cars);

        System.out.println("-- Iterator");
        Iterator<String> it = cars.iterator();
        System.out.println("next: <" + it.next() + ">");
        System.out.print("Loop:");
        while(it.hasNext())
            System.out.print(" " + it.next());
        System.out.println();

        System.out.println("-- sort");
        Collections.sort(cars);
        System.out.println(cars);
        it = cars.iterator();
        System.out.print("Loop:");
        while(it.hasNext())
            System.out.print(" " + it.next());
        System.out.println();
    }
}
