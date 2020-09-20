package main.java;

/**
 * Created by ding_ on 9/20/2020
 */

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class ExamineTime {
    public void Start(){
        LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalDateTime datetime = LocalDateTime.now();
        System.out.println(datetime);
    }
}
