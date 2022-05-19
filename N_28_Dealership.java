package com.Udemy;

import java.util.Scanner;

public class N_28_Dealership {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Java Dealership");
        System.out.println(" . Select option 'a' to buy a car");
        System.out.println(" . Select option 'b' to sell a car");
        String option = scan.nextLine();

        switch (option){
            case "a":
                System.out.println("What is your budget?");
                int budget = scan.nextInt();
                if(budget >= 10000){
                    System.out.println("Great! A Nissan Altima is available");
                    System.out.println("Do you have insurance? Write 'yes' or 'no'");
                    scan.nextLine();
                    String insurance = scan.nextLine();
                    System.out.println("Do you have a Licence? Write 'yes' or 'no'");
                    String licence = scan.nextLine();
                    System.out.println("What is your credit score?");
                    int creditScore = scan.nextInt();

                    if(insurance.equals("yes") && licence.equals("yes") && creditScore > 660){
                        System.out.println("Sold! Pleasure doing business with you");
                    }
                    else{
                        System.out.println("We're sorry. You are not eligible");
                    }
                }else{
                    System.out.println("We don't sell care under $10,000. Sorry!");
                }
                break;
            case "b":
                System.out.println("You chose option "+option);break;
            default:
                System.out.println("Invalid option");break;
        }
        scan.close();
    }
}