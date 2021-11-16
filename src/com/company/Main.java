package com.company;

import java.awt.font.FontRenderContext;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1,"Red");
        hashMap.put(2,"Green");
        hashMap.put(3,"Black");
        hashMap.put(4,"White");

        Integer key1 = 0;
        Integer key2 = 2;

        String value1 = "Grey";
        String value2 = "Red";

        addNewItemIfDoesntExit(hashMap, value1, key1);
        showHashMap(hashMap);

        System.out.println();

        addNewItemIfDoesntExit(hashMap, value2, key2);
        showHashMap(hashMap);
    }

    public static void addNewItemIfDoesntExit(HashMap<Integer, String> hashMap, String value, Integer key)
    {
        if(!hashMap.containsKey(key))
        {
            if(!hashMap.containsValue(value))
            {
                System.out.println("Item added in HashMap");
                hashMap.put(key, value);
            }else{
                System.out.println("Item already exist");
            }
        }else{
            System.out.println("Item already exist");
        }
    }
    public static void showHashMap(HashMap<Integer, String > hashMap)
    {
        System.out.println("Keys: ");
        for(Integer i : hashMap.keySet() )
        {
            System.out.print(i+", ");
        }
        System.out.println();
        System.out.println("Values: ");
        for (String i : hashMap.values())
        {
            System.out.print(i+", ");
        }
        System.out.println();

    }

}
