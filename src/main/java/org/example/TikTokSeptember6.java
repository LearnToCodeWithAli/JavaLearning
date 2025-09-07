package org.example;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;

@SuppressWarnings("")
public class TikTokSeptember6 {

    // int, long, String, float, doubles, conditional statements,
    // loops, HashMap, ArrayList


    // using a database, use rest API or crud application

    // tables - horse, owners, riding schedule
    // repository, service, controller

    public static void main(String[] args) {

        String title = "My favorite movie"; //String - text
        int numberOfPies = computeNumberOfPies(); // int - integer 2^32
        long numOfCars = 129932830948923840L; // long - 2^64

        //float cost = 4.56f; // 32-bits floating point number
        double money = 2.344553; // 64-bits

        double cost = 2.344553;

//        if(cost < 0){
//            System.out.println("Cost is not valid");
//        }
//        else if (cost <= 2){
//            System.out.println("The cost is less than 2.");
//        }
//        else if(cost <= 6){
//            System.out.println("The cost is less than 6.");
//        }
//        else{
//            System.out.println("The cost is greater than 6.");
//        }

        ArrayList<String> atla =
                new ArrayList<>(
                        Arrays.asList(
                                "Sokka", "Katara", "Aang", "Toph"));

        for (String character : atla) {
            System.out.println(character);
        }

    }

    private static int computeNumberOfPies() {
        return 10;
    }
}
