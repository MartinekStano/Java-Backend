package com.company;

import com.sun.source.tree.ClassTree;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Shiritori {

    private List<String> alreadySaidWords;

    public Shiritori(List<String> alreadySaidWords) {
        this.alreadySaidWords = alreadySaidWords;
    }
    public Shiritori() {

    }

    public List<String> getAlreadySaidWords() {

        return alreadySaidWords;
    }

    protected static void firstPlay(String lastWord, Shiritori shiritori)
    {
        shiritori.alreadySaidWords.add(lastWord);
        runGame(lastWord, shiritori);
    }

    private static void runGame(String inputWord, Shiritori shiritori)
    {
        boolean statusOfGame = true;
        String lastWord = inputWord;
        Scanner console = new Scanner(System.in);
        while(statusOfGame == true)
        {
            System.out.print("Zadajte dalsie slovo podla pravidiel: ");
            String newWord = console.next();
            statusOfGame = play(lastWord, newWord, shiritori);
            if(statusOfGame == true)
            {
                System.out.println("Correct Word!");
                shiritori.alreadySaidWords.add(newWord);
                lastWord = newWord;
            }
            else{
                statusOfGame = false;
                System.out.println("Game Over!");
            }
        }
    }

    protected static boolean play(String lastWord, String newWord, Shiritori shiritori)
    {
        boolean rule1 = rule1(lastWord, newWord);
        boolean rule2 = rule2(newWord, shiritori);

        return rule1 == rule2;
    }

    private static boolean rule1(String firstWord, String secondWord)
    {
       char helper1 = secondWord.charAt(0);
       int hel = firstWord.length();
       char helper2 = firstWord.charAt(hel-1);
       return helper1 == helper2;
    }

    private static boolean rule2(String newWord, Shiritori shiritori)
    {
        int compare = 0;
        for (int i=0; i< shiritori.alreadySaidWords.size(); i++)
        {
            if(shiritori.alreadySaidWords.get(i) == newWord)
            {
                compare++;
            }
        }
        return compare < 0.1;
    }
}

