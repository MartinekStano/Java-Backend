package com.company;

import java.util.*;

public class Main extends Shiritori {

    public static void main(String[] args) {

        PrintList printList = (List<Integer> list) -> {
            if(list.size() == 0)
            {
                System.out.println("List is empty");
            }else{
                for (int i : list) {
                    System.out.print(i+", ");
                }
                System.out.println();
            }
        };
        AddIfNotExits addIfNotExits = (List<Integer> list, int a) ->{
            if(list.contains(a))
            {
                System.out.println("Item is already exit in list!");
            }
            else
            {
                list.add(a);
            }
            printList.print(list);
        };
        List<Integer> Array1 = new ArrayList<>();
        Array1.add(1);
        Array1.add(1);
        Array1.add(1);
        Array1.add(2);
        Array1.add(2);
        Array1.add(3);
        Array1.add(4);
        Array1.add(5);
        List<Integer> Array2 = new ArrayList<>();

//       printList.print(Array1);
//       printList.print(Array2);

        int a = 1;
        int b = 8;

        addIfNotExits.addIfNotExits(Array1, a);
        System.out.println("---------------------------------------------------");
        addIfNotExits.addIfNotExits(Array1, b);

    }
    interface PrintList{
        void print(List<Integer> list);
    }
    interface AddIfNotExits{
        void addIfNotExits(List<Integer> list, int a);
    }
}
