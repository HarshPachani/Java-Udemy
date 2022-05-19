package com.Udemy.Module_1.Variables_2;
//Intro to the Scanner class.
import java.util.Scanner;

public class N_14_Survey {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome, Thank you for taking the survey");
        int counter = 0;//For finding the number of Questions.

        System.out.println("What is your name?");
        String name = scan.nextLine();
        counter++;

        System.out.println("How much money do you spend on coffee?");
        double coffePrice = scan.nextDouble();
        counter++;

        System.out.println("How much money do you spend on fast food?");
        double foodPrice = scan.nextDouble();
        counter++;

        System.out.println("How many times a week do you buy coffe?");
        int coffeAmount = scan.nextInt();
        counter++;

        System.out.println("How many times a week do you buy fast food?");
        int foodAmount = scan.nextInt();
        counter++;

        System.out.println("\nThank you "+name+" for answering all "+counter+" questions");
        System.out.println("\nYour fast food expenses are "+(foodPrice/coffePrice)+" times your coffe expences");
        System.out.println("\nweekly, you spend $"+ (coffeAmount*coffePrice)+ " on coffe");
        System.out.println("\nweekly, you spend $"+ (foodAmount*foodPrice)+ " on food");

        //When we open a scanner , it causes the memory leak, so it is a good practice to close the
        // scanner after work done.
        scan.close();
    }
}
