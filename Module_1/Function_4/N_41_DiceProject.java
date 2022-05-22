package com.Udemy.Module_1.Function_4;

import java.util.Scanner;
/*
Rules :
   - The user wins if :
     - dice rolls sum is smaller than number sum
     - And the difference between the two numbers is less than three.

*/
public class N_41_DiceProject {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int roll1 = rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();

        System.out.println("Enter three numbers between 1 and 6: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        if(num1 < 1 || num2 < 1 || num3 < 1){
            System.out.println("Numbers cannot be less than 1. Shutting game down");
            System.exit(0);
        }

        if(num1 > 6 || num2 > 6 || num3 > 6){
            System.out.println("Numbers cannot be higher than 6. Shutting the game down");
            System.exit(0);
        }

        int sumOfNumbers = num1 + num2 + num3 ;
        int sumDiceRolls =  roll1 + roll2 + roll3 ;
        System.out.println("Dice sum = " + sumDiceRolls + ". Number sum = " + sumOfNumbers);

        checkWin(sumDiceRolls,sumOfNumbers);

        scan.close();
    }

    public static int rollDice(){
        double randomNumber = Math.random() * 6 ;
        randomNumber += 1;
        return (int)randomNumber;
    }

    public static  void checkWin(int sumDiceRolls, int sumOfNumbers){
        if(sumOfNumbers > sumDiceRolls && (sumOfNumbers - sumDiceRolls) < 3){
            System.out.println("Congrats, You win!");
        }
        else{
            System.out.println("Sorry! You lose.");
        }
    }
}
