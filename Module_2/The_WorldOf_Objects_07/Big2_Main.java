package com.Udemy.Module_2.The_WorldOf_Objects_07;

//There are Big03 Which is needed in OOPs.
//Big01 : Constructor
//Big02 : Getter
//Big03 : Setter

public class Big2_Main {
        public static void main(String[] args) {
            Big2_Getter nissan = new Big2_Getter("Nissan", 5000, 2022, "red" ); //This nissan is a reference and can only point a car object.
            Big2_Getter dodge = new Big2_Getter("Dodge", 11000, 2020, "blue");

            //The Initial value will be Zero or null.
            //Update field:- We can update the fields of an object using Dot syntax.

        System.out.println(nissan.getColor());
        System.out.println("This "+ nissan.getMake() + " is worth $" + nissan.getPrice() +
                ". It was built in " + nissan.getYear() + ". It is " + nissan.getColor() + "\n");

        System.out.println("This "+ dodge.getMake() + " is worth $" + dodge.getPrice() +
                ". It was built in " + dodge.getYear() + ". It is " + dodge.getColor() + "\n");

        }
}
