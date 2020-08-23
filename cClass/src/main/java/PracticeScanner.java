package main.java;

/**
 * Created by dingw on 8/23/2020.
 */

import java.util.Scanner;

public class PracticeScanner {
    void TestScanner(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter username");
        String username = scan.nextLine();
        System.out.println(String.format("Username is <%s>", username));

    }
}
