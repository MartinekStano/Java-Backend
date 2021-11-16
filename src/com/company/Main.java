package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        HashMap<String, Integer> hashMap = new HashMap<>();

        hashMap.put("Red", 1);
        hashMap.put("Green", 2);
        hashMap.put("Black", 3);
        hashMap.put("White", 4);

        System.out.println("Keys: ");
        for(String i : hashMap.keySet() )
        {
            System.out.print(i+", ");
        }
        System.out.println();
        System.out.println("Values: ");
        for (Integer i : hashMap.values())
        {
            System.out.print(i+", ");
        }

    }
}
