package com.Udemy.Module_2.The_WorldOf_Objects_07;

public class Big3_Main {
    public static void main(String[] args) {
        Big3_Setter nissan = new Big3_Setter("Nissan", 5000, 2022, "red" ); //This nissan is a reference and can only point a car object.
        Big3_Setter dodge = new Big3_Setter("Dodge", 11000, 2020, "blue");

        nissan.setColor("Jet Black");
        dodge.setColor("Jet Black");

        nissan.setPrice(nissan.getPrice() /2 );
        dodge.setPrice(dodge.getPrice() / 2);

        System.out.println("This "+ nissan.getMake() + " is worth $" + nissan.getPrice() +
                ". It was built in " + nissan.getYear() + ". It is " + nissan.getColor() + "\n");

        System.out.println("This "+ dodge.getMake() + " is worth $" + dodge.getPrice() +
                ". It was built in " + dodge.getYear() + ". It is " + dodge.getColor() + "\n");

    }
}
