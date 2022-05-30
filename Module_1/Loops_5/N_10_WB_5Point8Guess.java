package com.Udemy.Module_1.Loops_5;

import java.util.Scanner;

public class N_10_WB_5Point8Guess {
    public static void main(String[] args) {
        /* Task 1
            1. Store a "secret" number between 1 and 5.
            2. Then, prompt the user to enter a guess.
       */
        /* Task 2
            1. Set up a loop that keeps running while the user is incorrect
               Every time they get it wrong, write 'Guess again: '

            2. Once they guess it, print: You got it!
        */
        Scanner scan = new Scanner(System.in);

        int number = 4;
        System.out.print("I chose a number between 1 and 5. Try to guess it: ");
        int guess = scan.nextInt();

        while(guess != number){
            System.out.println("Guess again: ");
            guess = scan.nextInt();
        }
        System.out.println("You got it!");
        scan.close();
    }
}
