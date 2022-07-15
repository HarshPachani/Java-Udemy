// package com.Udemy.Module_2.The_WorldOf_Objects_07.Workbook_02_VendingMachineApp;

public class Main {
    public static void main(String[] args) {
                System.out.println("\t************************************************");
                System.out.println("\t             WELCOME TO JAVA DRINKS!            ");
                System.out.println("\t************************************************");

                Item item = new Item("Pepsi", 3.99, 3);
        System.out.println(item);

        Item[][] items = new Item[][] {
             { new Item("Pepsi", 1.99, 3) , new Item("Fresca", 1.49, 3), new Item("Brisk", 2.49, 2) },
             { new Item("Fanta", 1.99, 2) , new Item("Barq's", 1.49, 2), new Item("A & W", 2.49, 3) },
             { new Item("Crush", 1.99, 2) , new Item("C-Cola", 1.49, 2), new Item("Berry", 2.49, 1) }
         };
        
        Machine machine = new Machine(items);
        /*Item item2 = machine.getItem(2, 1);
        item.setPrice(2.99);
        machine.setItem(item, 2, 1);
        System.out.println(machine.getItem(2, 1));*/
        
        machine.dispense(0, 0);
        machine.dispense(0, 0);
        System.out.println(machine.getItem(0, 0));
        }
}