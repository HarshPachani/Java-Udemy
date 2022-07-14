package com.Udemy.Module_2.The_WorldOf_Objects_07;

public class Main_For_Dealership {
    public static void main(String[] args) {
        TheBig03UpdateClass[] cars = new TheBig03UpdateClass[]//Array of an object.
        {
                new TheBig03UpdateClass("Nissan", 5000, 2022, "red", new String[]{"tires", "keys"}),
                new TheBig03UpdateClass("Dodge", 11000, 2020, "blue", new String[]{"tires", "keys"}),
                new TheBig03UpdateClass("Nissan", 5000, 2017, "yellow", new String[]{"tires", "filter"}),
                new TheBig03UpdateClass("Honda", 7000, 2019, "orange", new String[]{"tires", "filter"}),
                new TheBig03UpdateClass("Mercedes", 12000, 2015, "jet black", new String[]{"tires", "filter","transmission"}),
        };
        //Dealership class.
        Dealership dealership = new Dealership(cars);
        System.out.println(dealership);

        /*Here we fixed the dealership constructor of Dealership class and passed an array of an object and added a for loop in the constructor.
        and here we had to comment this whole code after for loop because to understand the constructor fixing.*/
        /*for (int i = 0; i < cars.length; i++) {
            dealership.setCar(cars[i],i);
        }

        //for updating the car information.
        TheBig03UpdateClass newCar = dealership.getCar(0);
        newCar.setColor("blue");
        System.out.println(dealership.getCar(0));

        dealership.sell(2);
//        System.out.println(dealership); //for printing all tha array of an object.
        System.out.println(dealership.search("Dodge", 11000));*/

    }
}
