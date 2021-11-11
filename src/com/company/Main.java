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

        DeleteEvenNumberInList deleteEvenNumberInList = List::remove;

        DeleteEvenNumbers deleteEvenNumbers = (List<Integer> list) -> {

            for (int i = 0; list.size() >= i; i++)
            {
                if(list.get(i) %2 == 0)
                {
                   deleteEvenNumberInList.deleteNumberInList(list, i);
                }
            }
            printList.print(list);
        };

        GetEvenNumbersFromList getEvenNumbersFromList = (List<Integer> list) ->{
          List<Integer> returnList = new ArrayList<>();

            for (Integer integer : list) {
                if (integer % 2 == 0) {
                    returnList.add(integer);
                }
            }
          return returnList;
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

//        int a = 1;
//        int b = 8;
//
//        addIfNotExits.addIfNotExits(Array1, a);
//        System.out.println("---------------------------------------------------");
//        addIfNotExits.addIfNotExits(Array1, b);

//        deleteEvenNumbers.deleteEven(Array1);
        printList.print(Array1);
        System.out.println(getEvenNumbersFromList.getEvenNumbers(Array1));
    }
    interface PrintList{
        void print(List<Integer> list);
    }
    interface AddIfNotExits{
        void addIfNotExits(List<Integer> list, int a);
    }
    interface DeleteEvenNumbers{
        void deleteEven(List<Integer> list);
    }
    interface DeleteEvenNumberInList{
        void deleteNumberInList(List<Integer> list, int index);
    }
    interface GetEvenNumbersFromList{
        List<Integer> getEvenNumbers(List<Integer> list);
    }
}
