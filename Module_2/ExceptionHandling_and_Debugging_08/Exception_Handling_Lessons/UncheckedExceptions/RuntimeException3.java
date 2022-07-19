package com.Udemy.Module_2.ExceptionHandling_and_Debugging_08.Exception_Handling_Lessons.UncheckedExceptions;

import java.util.Scanner;

public class RuntimeException3 {
    //This is showing InputMismatchException.
    //InputMismatchException is thrown by scanner, if the user enters a value that it wasn't expecting.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true){
            System.out.println("Please enter a number: ");
            //We cannot bypass the exception if we will use the try-catch, then simply in that case we use if-else.
            if (scan.hasNextInt()){
                System.out.println(scan.nextInt());
                break;
            }else{
                scan.nextLine();
            }

        }
        scan.close();
    }
}
