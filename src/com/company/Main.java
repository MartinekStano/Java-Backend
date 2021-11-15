package com.company;

import java.util.*;
import java.util.stream.Stream;

public class Main extends Shiritori {

    public static void main(String[] args) {

        PrintList printList = (List<Integer> list) -> {
            if(list.size() == 0)
            {
                System.out.println("List is empty");
            }else{
                list.forEach(System.out::print);
                System.out.println();
            }
        };

        DeleteEvenNumbers deleteEvenNumbers = (List<Integer> list) -> list.removeIf(n -> (n%2 == 0));

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

        deleteEvenNumbers.deleteEven(Array1);
        printList.print(Array1);
    }
    interface PrintList{
        void print(List<Integer> list);
    }

    interface DeleteEvenNumbers{
        void deleteEven(List<Integer> list);
    }

}
