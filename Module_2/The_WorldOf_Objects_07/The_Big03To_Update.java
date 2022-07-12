package com.Udemy.Module_2.The_WorldOf_Objects_07;

import java.util.Arrays;

//We'll have to update the constructor because we added a new parameter called parts.
public class The_Big03To_Update {
    public static void main(String[] args) {
        String[] parts = {"tires" , "keys"};
        TheBig03UpdateClass nissan = new TheBig03UpdateClass("Nissan", 5000, 2022, "red", parts); //This nissan is a reference and can only point a car object.
        TheBig03UpdateClass dodge = new TheBig03UpdateClass("Dodge", 11000, 2020, "blue", parts);

        TheBig03UpdateClass nissan2 = new TheBig03UpdateClass(nissan);
        nissan2.setColor("Yellow");
        nissan2.setParts(new String[] {"tires", "filter"}); //return new String[] {"1","2" ...};

        String[] outsideVariable = nissan.getParts();
        outsideVariable[1] = "hello";

        System.out.println("Parts of Nissan: " + Arrays.toString(nissan.getParts()));

        parts[1] = "rim"; //This variable will not change because we didn't fall in reference trap.
        System.out.println("Parts of Nissan2: " +Arrays.toString(nissan2.getParts()));//this will return null because the parameter we passed in the constructor is only Four.
        //so if we want to add a new field then we have to update the all big three(Constructor, Getter and Setter).

//        nissan.drive();
//        dodge.drive();
//        nissan2.drive();

        //After adding toString method in derived class.
        System.out.println("\n");
        System.out.println(nissan+"\n");
        System.out.println(dodge+"\n");
        System.out.println(nissan2+"\n");

        //Dealership class.
        Dealership dealership = new Dealership();
        dealership.setCar(nissan,0);
        dealership.setCar(dodge,1);
        dealership.setCar(nissan2,2);
    }
}
