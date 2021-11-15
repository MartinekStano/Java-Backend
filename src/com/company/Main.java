package com.company;

import java.util.*;

public class Main extends Shiritori {

    public static void main(String[] args) {

        GetWholeBudget getWholeBudget = (List<Person> personList) -> {
            Integer budget = personList.stream()
                    .map(Person::getBudget)
                    .reduce(0, Integer::sum);
            System.out.println(budget);
        };
        Person person1 = new Person("John", 21, 23000 );
        Person person2 = new Person("Steve", 32, 40000);
        Person person3 = new Person("Martin", 16, 2700);

        List<Person> personList = new ArrayList<>();

        personList.add(person1);
        personList.add(person2);
        personList.add(person3);

        getWholeBudget.wholeBudget(personList);
    }
    interface GetWholeBudget{
        void wholeBudget(List<Person> personList);
    }
}
