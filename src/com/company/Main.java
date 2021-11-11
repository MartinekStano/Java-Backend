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

        printList.print(Array1);
        printList.print(Array2);
    }
    interface PrintList{
        void print(List<Integer> list);
    }
}
