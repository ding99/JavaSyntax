package main.java;

/**
 * Created by ding_ on 9/20/2020
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Filing {
    String name = "d:\\test\\testJava\\testwrite01.txt";

    public void Start(){
        System.out.println("-- start Filing");
        Creating();
        Writing();
        Reading();
    }

    private void Reading(){
        System.out.println("-- Read file");
        try{
            File file = new File(name);
            Scanner reader = new Scanner(file);
            while(reader.hasNextLine()){
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();
        } catch(FileNotFoundException e){
            System.out.println("An error occurred.");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    private void Writing(){
        System.out.println("-- Write file");
        try{
            FileWriter writer = new FileWriter(name);
            writer.write("Files in Java might be tricky, but is is fun enough!");
            writer.close();
            System.out.println("Successfully wrote to the file");
        } catch (IOException e){
            System.out.println("An error occurred.");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    private void Creating(){
        System.out.println("-- Create file");

        try {
            File file = new File(name);
            if(file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch(IOException e){
            System.out.println("An error occurred.");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
