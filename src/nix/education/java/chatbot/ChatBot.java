package nix.education.java.chatbot;

import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args){
        System.out.println("Hello! My name is BOT " +
                "\nI was created in 2021");

        System.out.println("Please,remind me your name.");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("What a great name you have," + name + "! ");

        System.out.println("Let me guess your age. " +
                "\nEnter remainders if dividing your age by 3,5 and 7.");
        int remainder3 = scanner.nextInt();
        int remainder5 = scanner.nextInt();
        int remainder7 = scanner.nextInt();
        int age = (remainder3*70+remainder5*21+remainder7*15)%105;
        System.out.println("Your age is "+ age + " ;that`s a good time to start programming!");

        System.out.println("Now I will prove to you that I can count to any number you want.");
        int number = scanner.nextInt();
        for(int i=0;i <= number;i++){
            System.out.println(i + "!");
        }

        for(int j = 0;j<=2;j++){
            System.out.println("A little test: \n1) 2+2=?  \n1.3 2.4 3.5" );
            int answer = scanner.nextInt();
            if(answer == 2){
                System.out.println("Great, you right!");
                System.out.println("Goodbye, have a nice day!");
            }else{
                System.out.println("Please, try again");
            }
        }

    }
}
