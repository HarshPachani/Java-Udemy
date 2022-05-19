package com.Udemy.Module_1.Variables_2;
import java.util.Scanner;

public class N_15_WB_2Point5_SignUp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to JavaGram! Let's sign you up.");


        //Task 1 - Using Scanner, ask the user questions

        //Ask for their first name.
        System.out.println("Enter Your first name:");
        String fName = scan.nextLine();

        //Ask for their last name.
        System.out.println("Enter Your last name:");
        String lName = scan.nextLine();

        //Ask: how old are you?
        System.out.println("Enter Your Age:");
        int age = scan.nextInt();

        /* Ask them to make a username. SIDE NOTE:
           – nextLine() gets "skipped" if you put it ahead of nextInt() , nextDouble(), nextLong().
           – You will understand why this happens when we cover Delimiters in the next section (Booleans and Conditionals).
           – For now, just know that the solution is to add an extra nextLine().
        */
        scan.nextLine();
        System.out.println("Make a Username:");
        String uName = scan.nextLine();

        //Ask what city they live in.
        System.out.println("Which City do you live in?");
        String city = scan.nextLine();

        //Ask what country that's from.
        System.out.println("What country are you from?");
        String country = scan.nextLine();

        //Task 2 - Print their information.


        //Print their information like so:

        // Your information:
        //        First Name: Rayan
        //        Last Name: Slim
        //        Age: 27
        //        Username: monotonic_relu
        //        City: Ottawa
        //        Country: Canada
        System.out.println("\nThank you for joining JavaGram!");
        System.out.println("Your information:");
        System.out.println("\t\tFirst Name: "+fName);
        System.out.println("\t\tLast Name: "+lName);
        System.out.println("\t\tAge: "+age);
        System.out.println("\t\tUserName: "+uName);
        System.out.println("\t\tCity: "+city);
        System.out.println("\t\tCountry: "+country);

        scan.close();
        //close scanner. It's good practice :D !
    }
}
