package main.java;

/**
 * Created by ding_ on 8/23/2020
 */

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class PracticeTime {
    void Start(){
        System.out.println("=> Practice local date-time and date-time formatter");

        LocalDateTime date = LocalDateTime.now();
        System.out.println("Before formatting: " + date.toString());

        System.out.println(date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")));
        System.out.println(date.format(DateTimeFormatter.ofPattern("E, MMM dd yyyy")));

        Lists();
    }

    void Lists(){
        System.out.println("=> Practice ArrayList");
        List<Integer> list = new ArrayList<Integer>();
        list.add(5);list.add(15);list.add(25);
        for(Integer i : list) System.out.print(i  + " ");
        System.out.println();
    }
}
