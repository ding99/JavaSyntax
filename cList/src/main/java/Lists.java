package main.java;

/**
 * Created by ding_ on 9/20/2020
 */

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Lists {

    public void Start(){
        AList();
    }

    private void AList(){
        System.out.println("-- ArrayList");
        List<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        Collections.sort(cars);
        System.out.println(cars);
    }
}
