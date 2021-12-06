package nix.education.java.hangman;

import java.util.*;

public class Hangman {
    public void play(){
        menu();
    }
    public void menu(){
        Scanner scanner = new Scanner(System.in);
        for(int i = 1; i>i-1;i++){
            System.out.println("HANGMAN");
            System.out.print("Type play to play the game,exit to quit:> ");
            String answer = scanner.nextLine();
            if(Objects.equals(answer,"play")){
                words();
            }else {
                break;
            }
        }
    }
    public void words() {
        Random random = new Random();
        List<String> Words = new ArrayList<String>();
        Words.add("java");
        Words.add("python");
        Words.add("javascript");
        Words.add("kotlin");
        String rndWords = Words.get(random.nextInt(Words.size()));
        Set<String> word = new HashSet<>();
        List<String> letters = new ArrayList<>();
        for (int j = 0; j < rndWords.length(); j++) {
            word.add(String.valueOf(rndWords.charAt(j)));
        }
        check(word,rndWords,letters);
    }
    public void check(Set<String> word,String rndWords,List<String> letters){
        Scanner scanner = new Scanner(System.in);
        String replaceword;
        System.out.println(rndWords.replaceAll("[a-zA-Z]","-"));
        for(int i = 8; i >= 1;){
            System.out.print("Input a letter:> ");
            String letter = scanner.nextLine();
            if(letters.contains(letter)){
                System.out.println("You've already guessed this letter.");
            }
            if(letter.length() > 1){
                System.out.println("You should input a single letter.");
            }
            if(word.contains(letter) && !letters.contains(letter)){
                letters.add(letter);
                replaceword = rndWords.replaceAll("[^"+letters+"]","-");
                System.out.println(replaceword);
            }
            if (letter.matches("[A-Z]")){
                System.out.println("Please enter a lowercase English letter.");
            }
            if (letters.size() == word.size()){
                System.out.println("You survived!");
                break;
            }
            if (!word.contains(letter) && letter.length() < 2){
                System.out.println("That letter doesn't appear in the word");
                i--;
                if(i==0){
                    System.out.println("You lost!");
                }
            }
        }
    }
}

