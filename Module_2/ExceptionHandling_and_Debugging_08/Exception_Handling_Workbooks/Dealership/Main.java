package com.Udemy.Module_2.ExceptionHandling_and_Debugging_08.Exception_Handling_Workbooks.Dealership;

import com.Udemy.Module_2.ExceptionHandling_and_Debugging_08.Exception_Handling_Workbooks.Dealership.Models.Car;
import com.Udemy.Module_2.ExceptionHandling_and_Debugging_08.Exception_Handling_Workbooks.Dealership.Models.Dealership;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Car[] cars = new Car[] {
            new Car("Nissan", 5000),
            new Car("Toyota", 12000),
        };
        cars[1].setMake("Honda");
        cars[1].setPrice(8500);

        Dealership dealership = new Dealership(cars);

        System.out.println("\n************* JAVA DEALERSHIP *************");
        while (true) {
            System.out.println(dealership);
            System.out.print("Enter the spot number of the car you want to buy: ");
            int spot = scan.nextInt();
            dealership.sell(spot);    
        }

       //scan.close();

    }
}
