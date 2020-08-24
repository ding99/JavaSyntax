package main.java;

/**
 * Created by ding_ on 8/23/2020
 */

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class PracticeTime {
    void Start(){
        System.out.println("=> Practice local date-time and date-time formatter");

        LocalDateTime date = LocalDateTime.now();
        System.out.println("Before formatting: " + date.toString());

        System.out.println(date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")));
        System.out.println(date.format(DateTimeFormatter.ofPattern("E, MMM dd yyyy")));

        Lists();
        HashSets();
        Iteration();
    }

    void Lists(){
        System.out.println("=> Practice ArrayList");
        List<Integer> list = new ArrayList<Integer>();
        list.add(5);list.add(15);list.add(25);
        for(Integer i : list) System.out.print(i  + " ");
        System.out.println();
    }

    void HashSets(){
        System.out.println("=> Practice HashSet");
        HashSet<String> cars = new HashSet<>();
        cars.add("BMW"); cars.add("Volvo"); cars.add("Mazda");
        for(String c : cars) System.out.print(c + " ");
        System.out.println();

        System.out.println("Volvo existing: (" + cars.contains("Volvo") + ")");
        System.out.println("Remove Volvo"); cars.remove("Volvo");
        for(String c : cars) System.out.print(c + " ");
        System.out.println();
    }

    void Iteration(){
        System.out.println("=> Iteration");
        ArrayList<String> cars = new ArrayList<>();
        cars.add("BMW"); cars.add("Volvo"); cars.add("Mazda"); cars.add("Ford");
        Iterator<String> it = cars.iterator();
        while(it.hasNext()) System.out.print(it.next() + " ");
        System.out.println();
        int size = cars.size();
        for(int i = 0; i < size; i++) System.out.print(cars.get(i) + " ");
        System.out.println();
    }
}
