package com.Udemy.Module_2.The_WorldOf_Objects_07;

public class N_01_Main {
    public static void main(String[] args) {
        Car nissan = new Car("Nissan", 5000, 2022, "red" ); //This nissan is a reference and can only point a car object.
        Car dodge = new Car("Dodge", 11000, 2020, "blue");

        //The Initial value will be Zero or null.
        //Update field:- We can update the fields of an object using Dot syntax.
        System.out.println(nissan.make);
        System.out.println(nissan.price);
        System.out.println(nissan.year);
        System.out.println(nissan.color);
        System.out.println();

        System.out.println("This "+ nissan.make + " is worth $" + nissan.price +
                ". It was built in " + nissan.year + ". It is " + nissan.color + "\n");

        System.out.println("This "+ dodge.make + " is worth $" + dodge.price +
                ". It was built in " + dodge.year + ". It is " + dodge.color + "\n");

    }
}
