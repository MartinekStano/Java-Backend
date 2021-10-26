package com.company;

import java.util.List;

public class Warrior {
    private String name;
    private int life;
    private int speed;
    private int muscle;
    private List<Item> items;

    public Warrior(String name, int life, int speed, int muscle, List<Item> items) {
        this.name = name;
        this.life = life;
        this.speed = speed;
        this.muscle = muscle;
        this.items = items;
    }

    public String getName() {
        return name;
    }

    public int getLife() {
        return life;
    }

    public int getSpeed() {
        return speed;
    }

    public int getMuscle() {
        return muscle;
    }

    public List<Item> getItems() {
        return items;
    }
    public static void battle(Warrior warrior1, Warrior warrior2)
    {

        if(warrior1.muscle+warrior1.life+ warrior1.speed > warrior2.muscle + warrior2.life+ warrior2.speed)
        {
            System.out.println("Warrior1 WIN!");
            System.out.println("------------------------------------");

            warrior1.items.add(getTheHighestItem(warrior2));
            warrior2.items.remove(compareItem(getTheHighestItem(warrior2), warrior2));
            warrior2.life --;

            System.out.println("Warrior1 Life: "+warrior1.life);
            for(Item item : warrior1.items)
            {
                System.out.println(item.getName()+" - "+ item.getValue());
            }

            System.out.println("------------------------------------");
            System.out.println("Warrior2 Life: "+warrior2.life);
            for(Item item : warrior2.items)
            {
                System.out.println(item.getName()+" - "+ item.getValue());
            }
        }
        else if(warrior2.muscle+ warrior2.life+ warrior2.speed > warrior1.muscle +warrior1.life+ warrior1.speed)
        {
            System.out.println("Warrior2 WIN!");
        }
        else {
            System.out.println("DRAW!");
        }

    }
    public static Item getTheHighestItem(Warrior warrior)
    {
        int max = 0;
        int value = 0;
        String name = "";

        for(int i = 0; i < warrior.items.size(); i++)
        {
            if(warrior.items.get(i).getValue() > max)
            {
                value = warrior.items.get(i).getValue();
                name = warrior.items.get(i).getName();
            }
        }
        Item item = new Item(name, value);
        return item;
    }
    public static int compareItem(Item item, Warrior warrior)
    {
        int index = 0;
        for(int i = 0; i < warrior.items.size(); i++)
        {
            if(warrior.items.get(i).getName() == item.getName() && warrior.items.get(i).getValue() == item.getValue())
            {
                index = i;
            }
        }
        return index;
    }
}
