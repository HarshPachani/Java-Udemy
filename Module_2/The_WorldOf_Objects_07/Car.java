package com.Udemy.Module_2.The_WorldOf_Objects_07;

//This car class is bluePrint, and with this car class we can make many car objects.
public class Car {
    String make;
    double price;
    int year;
    String color;

    //Constructor: The Constructor runs after you create an object.
    //Updating fields one at a time isn't very efficient.In fact, it takes a lot of code.
    //so our goal is to use a constructor to update fields with a constructor.
    public Car(String make, double price, int year, String color){
        //this keyword:- this means Current object.
        this.make = make;
        this.price = price;
        this.year= year ;
        this.color = color;
    }
}