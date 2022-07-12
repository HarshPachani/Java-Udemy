package com.Udemy.Module_2.The_WorldOf_Objects_07;

//Reference Trap:- it occurs when many variable share a same reference to one object.
//When we update the object threw one variable it's going to affect the other.
public class Big3_Main {
    public static void main(String[] args) {
        Big3_Setter nissan = new Big3_Setter("Nissan", 5000, 2022, "red" ); //This nissan is a reference and can only point a car object.
        Big3_Setter dodge = new Big3_Setter("Dodge", 11000, 2020, "blue");

//        Big3_Setter nissan2 = nissan;
//        nissan2.setColor("yellow"); //This is reference trap.

        Big3_Setter nissan2 = new Big3_Setter("Nissan", 5000, 2022, "yellow"); //The solution of the reference trap(By creating a new object).
        nissan.setColor("Jet Black");
        dodge.setColor("Jet Black");

        nissan.setPrice(nissan.getPrice() /2 );
        dodge.setPrice(dodge.getPrice() / 2);

        System.out.println("This "+ nissan.getMake() + " is worth $" + nissan.getPrice() +
                ". It was built in " + nissan.getYear() + ". It is " + nissan.getColor() + "\n");

        System.out.println("This "+ dodge.getMake() + " is worth $" + dodge.getPrice() +
                ". It was built in " + dodge.getYear() + ". It is " + dodge.getColor() + "\n");

        System.out.println("This "+ nissan2.getMake() + " is worth $" + nissan2.getPrice() +
                ". It was built in " + nissan2.getYear() + ". It is " + nissan2.getColor() + "\n");

        nissan.drive();
        dodge.drive();
        nissan2.drive();
    }
}
