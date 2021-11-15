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
        MultiplyByLength multiplyByLength = (List<Integer> list) -> {
            List<Integer> listOfEvenNumbers = new ArrayList<>();

            list.stream().map(i->i*list.size()).forEach(listOfEvenNumbers::add);
            System.out.println(listOfEvenNumbers);
        };

        List<Integer> Array1 = new ArrayList<>();
        Array1.add(2);
        Array1.add(3);
        Array1.add(1);
        Array1.add(0);

        multiplyByLength.multiplyList(Array1);
    }
    interface PrintList{
        void print(List<Integer> list);
    }
    interface MultiplyByLength {
        void multiplyList(List<Integer> list);
    }
}
