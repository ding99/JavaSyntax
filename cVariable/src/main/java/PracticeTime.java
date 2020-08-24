package main.java;

/**
 * Created by ding_ on 8/23/2020
 */

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PracticeTime {
    void Start(){
        System.out.println("=> Practice local date-time and date-time formatter");

        LocalDateTime date = LocalDateTime.now();
        System.out.println("Before formatting: " + date.toString());

        System.out.println(date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")));
        System.out.println(date.format(DateTimeFormatter.ofPattern("E, MMM dd yyyy")));
    }
}
