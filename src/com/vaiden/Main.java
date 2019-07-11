package com.vaiden;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        HashMap<String, Integer> hash_map = new HashMap<String, Integer>();
        Scanner scanner1 = new Scanner(System.in);
        int val = 1;


        System.out.println("Enter what you would like to add to hashmap, enter quit to stop!");


        String userInput = scanner1.next();
        while (!userInput.equals("quit")) {

            if (hash_map.containsKey(userInput)) {
                hash_map.put(userInput, val);
                val++;
                System.out.println("This was entered " + val + " times");

            } else {
                hash_map.put(userInput, 0);
            }
            userInput = scanner1.nextLine();
        }
    }
}
