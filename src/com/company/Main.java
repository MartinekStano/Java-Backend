package com.company;

import java.util.*;

public class Main extends Shiritori {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        List<String> helplist = new ArrayList<>();
        Shiritori shiritori = new Shiritori(helplist);
        System.out.print("Zadajte prve slovo: ");
        String input = console.next();
        helplist.add(input);
        firstPlay(input, shiritori);
    }
}
