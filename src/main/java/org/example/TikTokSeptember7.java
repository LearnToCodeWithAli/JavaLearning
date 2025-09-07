package org.example;

import org.example.enums.Characters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static org.example.enums.Characters.AANG;
import static org.example.enums.Characters.valueOf;

public class TikTokSeptember7 {

    // int, long, String, float, doubles, conditional statements,
    // loops, HashMap, ArrayList

    public static void main(String[] args){

        int numOfCars = 5; // int - primitive type - size 2^32
        long startTime = System.currentTimeMillis(); // long - primitive type - size 2^64

        float cost = 3.99f; // float - floating point number - primitive
        double pi = 3.14159265359; // double

        String name = "Katara"; // string - some text

//        if(name.equals("Aang")){
//            System.out.println("I am the Avatar");
//        }
//        else if(name.equals("Toph")){
//            System.out.println("I am the Blind Bandit!");
//        }
//        else{
//            System.out.println("I am not the Avatar");
//        }

        // Make a function with a loop find the smallest number in a list?
        // System.out.print("Enter your speed: ");

        Scanner scanner = new Scanner(System.in);


//        if (speed < 15){
//            System.out.println("You are going too slow!");
//        }
//        else if (speed > 15 && speed < speedLimit){
//            System.out.println("You are within the speed limit");
//        }
//        else if(speed < 50){
//            System.out.println("You are going too fast!");
//        }
//        else{
//            System.out.println("You're getting a ticket, buddy!");
//        }


//        int speed = scanner.nextInt();
//
//        while (speed != 100){
//            checkSpeed(speed);
//            System.out.print("Enter your speed: ");
//            speed = scanner.nextInt();
//        }

        System.out.println((Arrays.asList("Aang", "Katara", "Toph", "Sokka").getClass()));

        ArrayList<String> atla = new ArrayList<>(Arrays.asList("Aang", "Katara", "Toph", "Sokka"));

        String quote = "";
        for(String character: atla){
            Characters atlaCharacter = valueOf(character.toUpperCase());

            switch(atlaCharacter){
                case AANG:
                    quote = "I'm the avatar";
                case KATARA:
                    quote = "I'm a waterbender";
                case TOPH:
                    quote = "I'm the Blind Bandit!";
                case SOKKA:
                    quote = "I'm the strongest warrior in the village!";
            }
        }

        System.out.println(quote);


    }

    private static void checkSpeed(int speed) {
        int speedLimit = 30;

        if (speed > 50){
            System.out.println("You're getting a ticket, buddy!");
        }
        else if (speed > speedLimit){
            System.out.println("You are going too fast!");
        }
        else if(speed > 15 && speed < speedLimit){
            System.out.println("You are within the speed limit");
        }
        else{
            System.out.println("You are going too slow!");
        }
    }
}
