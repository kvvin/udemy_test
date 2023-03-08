package Basics;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        int min = 1; int max = 20;
        System.out.println("Welcome to the Game, please enter your name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello "+name+" Can we start the game(Y/N)");
        char start = sc.nextLine().charAt(0);
        if(start == 'Y'|| start =='y') {
            int x = (int)(Math.random()*(max-min+1)+min);
            for (int i = 0; i <= 5; i++) {
                System.out.println("Enter your guess");
                double g = sc.nextDouble();
                if (g == x) {
                    System.out.println("Congrats you guessed it right!!");
                    break;
                } else if (g>x) {
                    System.out.println("Guess Lower");

                } else if (g<x) {
                    System.out.println("Guess higher");
                } else {
                    System.out.println("Oops wrong guess! Try again");
                }

            }
            System.out.println(x);
        }
        else{
            System.out.println("Sorry to see you go!");
        }


    }
}
