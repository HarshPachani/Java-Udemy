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

        System.out.println(Arrays.toString(nissan.parts));//this will return null because the parameter we passed in the constructor is only Four.
        //so if we want to add a new field then we have to update the all big three(Constructor, Getter and Setter).

//        nissan.drive();
//        dodge.drive();
//        nissan2.drive();
    }
}
