package com.company;

import java.util.*;

public class Main extends Shiritori {

    public static void main(String[] args) {

        ContainsCharInList containsCharInList = (List<Person> personList) ->{

        boolean result = personList.stream()
                            .anyMatch(e -> e.getName().contains("a"));
            System.out.println(result);
        };
        Person person1 = new Person("John", 21, 23000 );
        Person person2 = new Person("Steve", 32, 40000);
        Person person3 = new Person("Martin", 16, 2700);

        List<Person> personList = new ArrayList<>();

        personList.add(person1);
        personList.add(person2);
        personList.add(person3);

        containsCharInList.containsChar(personList);
    }
    interface ContainsCharInList{
        void containsChar(List<Person> personList);
    }
}
