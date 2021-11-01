package nix.education.java.coffeemachine;

import java.util.*;
import java.util.Scanner;

import static java.lang.System.exit;

public class CoffeeMachine{
    static int money = 550;
    static int water = 400;
    static int milk = 540;
    static int coffeebeanSin = 120;
    static int disposablecups = 9;
    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        coffeemachine();

    }

    static void coffeemachine() {
        System.out.println("Write action(buy, fill, take , remaining, exit):");
        Scanner scanner = new Scanner(System.in);
        String action = scanner.nextLine();
        switch (action){
            case "exit":
                exit(0);
            case "buy":
                buy();
            case "fill":
                fill();
            case "remaining":
                remaining();
            case "take":
                take();
            default:
                System.out.println("Please try again!");
                coffeemachine();
        }
    }

    static void buy() {
        System.out.println("What do you want to buy? 1 - Espresso, 2 - Latte, 3 - Cappuccino,4 - Back to main menu.");
        int coffee = scanner.nextInt();
        switch (coffee){
            case 1:
                espresso();
            case 2:
                latte();
            case 3:
                cappuccino();
            case 4:
                coffeemachine();
        }

    }

    static void fill() {
        System.out.println("Write how many ml of water the coffee machine has:");
        int water_fill = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int milk_fill = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int coffee_beans_fill = scanner.nextInt();
        System.out.println("Write how many disposable cups the coffee machine has:");
        int disposable_cups_fill = scanner.nextInt();
        water += water_fill;
        milk += milk_fill;
        coffeebeanSin += coffee_beans_fill;
        disposablecups += disposable_cups_fill;
        coffeemachine();
    }

    static void remaining() {
        System.out.println("The coffee machine has:\n"+
                water +" of water\n" +
                milk +" of milk\n" +
                coffeebeanSin +" of coffee beans\n"+
                disposablecups +" of disposable cups\n"+
                money +" of money");
        coffeemachine();
    }

    static void take() {
        System.out.println("I gave you " + money);
        money = 0;
        coffeemachine();
    }

    static  void espresso(){
        if (water < 250 || coffeebeanSin < 16 || disposablecups < 1) {
            if (water < 250) {
                System.out.println("Sorry, not enough water!");
                coffeemachine();
            }
            if (coffeebeanSin < 16) {
                System.out.println("Sorry, not enough coffee beans!");
                coffeemachine();
            }
            if (disposablecups < 1) {
                System.out.println("Sorry, not enough disposable cups!");
                coffeemachine();
            }
        } else {
            money += 4;
            water -= 250;
            coffeebeanSin -= 16;
            disposablecups -= 1;
            System.out.println("I have enough resources, making you a coffee!");
            coffeemachine();
        }
    }

    static void latte(){
        if (water < 350 || milk < 75 || coffeebeanSin < 20 || disposablecups < 1) {
            if (water < 350) {
                System.out.println("Sorry, not enough water!");
                coffeemachine();
            }
            if (coffeebeanSin < 20) {
                System.out.println("Sorry, not enough coffee beans!");
                coffeemachine();
            }
            if (milk < 75) {
                System.out.println("Sorry, not enough milks");
                coffeemachine();
            }
            if (disposablecups < 1) {
                System.out.println("Sorry, not enough disposable cups!");
                coffeemachine();
            }
        } else {
            money += 7;
            water -= 350;
            coffeebeanSin -= 20;
            milk -= 75;
            disposablecups -= 1;
            System.out.println("I have enough resources, making you a coffee!");
            coffeemachine();
        }
    }

    static void cappuccino(){
        if (water < 200 || milk < 100 || coffeebeanSin < 12 || disposablecups < 1) {
            if (water < 200) {
                System.out.println("Sorry, not enough water!");
                coffeemachine();
            }
            if (coffeebeanSin < 12) {
                System.out.println("Sorry, not enough coffee beans!");
                coffeemachine();
            }
            if (milk < 100) {
                System.out.println("Sorry, not enough milks");
                coffeemachine();
            }
            if (disposablecups < 1) {
                System.out.println("Sorry, not enough disposable cups!");
                coffeemachine();
            }
        } else {
            money += 6;
            water -= 200;
            coffeebeanSin -= 12;
            milk -= 100;
            disposablecups -= 1;
            System.out.println("I have enough resources, making you a coffee!");
            coffeemachine();
        }
    }

}
