package com.Udemy.Module_2.ExceptionHandling_and_Debugging_08.Exception_Handling_Workbooks.Vending_Machine;

import com.Udemy.Module_2.ExceptionHandling_and_Debugging_08.Exception_Handling_Workbooks.Vending_Machine.Models.Item;
import com.Udemy.Module_2.ExceptionHandling_and_Debugging_08.Exception_Handling_Workbooks.Vending_Machine.Models.Machine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("\t************************************************");
        System.out.println("\t             WELCOME TO JAVA DRINKS!            ");
        System.out.println("\t************************************************");

        Item[][] items = new Item[][] {
                { new Item("Pepsi", 1.99, -3) , new Item("Fresca", 1.49, 3), new Item("     ", 2.49, -2) },
                { new Item("Fanta", 1.99, 2) , new Item("      ", 1.49, 2), new Item("A & W", 2.49, 3) },
                { new Item("     ", 1.99, 2) , new Item("C-Cola", 1.49, 2), new Item("Berry", -2.49, 1) }
        };

        Machine machine = new Machine(items);

        System.out.println(machine);

        while (true) {
            System.out.print("Pick a row: ");
            int row = scan.nextInt();
            System.out.print("Pick a spot in the row: ");
            int spot = scan.nextInt();

            machine.dispense(row, spot);
            System.out.println("\n" + machine);
            System.out.print("\nEnjoy your drink! Press 1 to purchase another: ");
            if (!scan.next().equalsIgnoreCase("1")) {
                break;
            }
        }
        scan.close();
    }
}

