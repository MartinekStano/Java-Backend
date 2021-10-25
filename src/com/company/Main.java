package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	Item item1 = new Item("goldfish", 45);
    Item item2 = new Item("watch", 15);
    Item item3 = new Item("dog", 53);

    List<Item> items1 = new ArrayList<Item>();
    List<Item> items2 = new ArrayList<Item>();
    items1.add(item1);
    items2.add(item2);
    items2.add(item3);

    Warrior warrior1 = new Warrior("warrior1",10,4,7,items1);
    Warrior warrior2 = new Warrior("warrior2",9,5,3,items2);

    Warrior.battle(warrior1, warrior2);
    }
}
