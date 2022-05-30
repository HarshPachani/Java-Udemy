package com.Udemy.Module_1.Loops_5;

public class N_9_While_Loop {
    public static void main(String[] args) {
        //When to use while loop?
        // --> When you are not clear how many times the code will run.
        //for EX:-
        double choice = 0.01;
        double guess = 0.99;
        while(guess > choice){
            guess = Math.random(); //Here guess will be random number that will always be changed every time the loop runs.
            System.out.println("Hi, in the loop");
        }
        //This is the best ex. of while loop where we cannot predict how many times the loop will run.
        //Use while loop to run as long as something is true.
    }
}
