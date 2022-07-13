package com.Udemy.Module_2.The_WorldOf_Objects_07;

public class Main_For_Dealership {
    public static void main(String[] args) {
        TheBig03UpdateClass[] cars = new TheBig03UpdateClass[]//Array of an object.
        {
                new TheBig03UpdateClass("Nissan", 5000, 2022, "red", new String[]{"tires", "keys"}),
                new TheBig03UpdateClass("Dodge", 11000, 2020, "blue", new String[]{"tires", "keys"}),
                new TheBig03UpdateClass("Nissan", 5000, 2022, "yellow", new String[]{"tires", "filter"}),
        };
        //Dealership class.
        Dealership dealership = new Dealership();
        for (int i = 0; i < cars.length; i++) {
            dealership.setCar(cars[i],i);
        }

        TheBig03UpdateClass newCar = dealership.getCar(0);
        newCar.setColor("blue");
        System.out.println(dealership.getCar(0));
    }
}
