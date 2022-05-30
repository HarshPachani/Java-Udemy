package com.Udemy.Module_1.Loops_5;

import java.util.Scanner;

public class N_14_WB_5Point11_JavaRolls {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /* Task 1:
              1. print: Let's play Rolling Java. Type anything to start.
              2. Get the user to enter any value
        */
        System.out.println("Let's play Rolling Java. Type anything to start.");
        scan.nextLine();

        /* Task 2:
              1. Once the user is ready, print:
                    Great, here are the rules:\n
                     - If you roll a 6 the game stops.
                     - If you roll a 4 nothing happens.
                     - Otherwise, you get 1 point.\n
                    You must collect at least 3 points to win. Enter anything to roll:
              2. Get the user to enter any value
        */
        System.out.println("Great, here are the rules:\\n\n" +
                "                     - If you roll a 6 the game stops.\n" +
                "                     - If you roll a 4 nothing happens.\n" +
                "                     - Otherwise, you get 1 point.\\n\n" +
                "                    You must collect at least 3 points to win. Enter anything to roll:");
        scan.nextLine();

        int score = 0;
       /*
         Task 3
          1. Make a while loop that runs forever
          2. During each run, get them to enter a random value


          Task 5
           1. During each run, call the rollDice() function.
           2. Print each dice roll like so: You rolled a <diceRoll>.


          Task 6
            If the user rolls a 6:
              1. print: End of game.
              2. stop the game.

            If the user rolls a 4:
              1. print: Zero points. Keep rolling.

            If the user rolls anything else:
              1. update the points variable by 1
              2. print: One point. Keep rolling.

       */

        while(true){
            int dice = rollDice();
            System.out.println("You rolled a " + dice + ". ");
            if(dice == 6){
                System.out.println("End of game");
                break;
            } else if (dice == 4) {
                System.out.println("Zero points. Keep rolling.");
            }else {
                score++;
                System.out.println("One point. Keep rolling.");
            }
        }

      /* Task 7

           1.  After the game ends, check the user's points.
                 System.out.println("\nYour score is: " + score);

           2. If the score is greater than or equal to 3, print:
                  Wow, that's lucky. You win!
              Otherwise, print:
                  Tough luck, you lose :(
      */
        System.out.println("\nYour score is: " + score);

        if(score >= 3){
            System.out.println("Wow, that's lucky. You win!");
        }else{
            System.out.println("Tough luck, you lose :(");
        }
        scan.close();
    }


    /** Task 4
     * Function name: rollDice – rolls a dice between 1 and 6
     * @return randomNumber (int)
     *
     */
    public static int rollDice(){
        double roll = Math.random() * 6;
        roll += 1;
        return (int)roll;
    }

}
