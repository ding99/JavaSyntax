package main.java;

/**
 * Created by ding_ on 9/20/2020
 */

import java.time.*;
import java.time.format.DateTimeFormatter;

public class ExamineTime {
    public void Start(){
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        System.out.println("Data: " + date + ", Time: " + time);

        LocalDateTime datetime = LocalDateTime.now();
        System.out.println("Before formatting: " + datetime);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println("After  formatting: " + formatter.format(datetime));
    }
}
