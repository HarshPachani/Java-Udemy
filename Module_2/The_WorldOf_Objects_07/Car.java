package com.Udemy.Module_2.The_WorldOf_Objects_07;

//This car class is bluePrint, and with this car class we can make many car objects.
public class Car {
    //Field should be Private
    //  -You should not have direct access to them.
    //because when we access the  field, we are using an actual field instead of reference.
    //So we use private so that we can not accidentally change the value of the actual field.
    //and use reference or copy of that field, using getters and setters.

    private String make;
    private double price;
    private int year;
    private String color;

    //Constructor: The Constructor runs after you create an object.
    //Updating fields one at a time isn't very efficient.In fact, it takes a lot of code.
    //so our goal is to use a constructor to update fields with a constructor.
    public Car(String make, double price, int year, String color)//These variables are the variables of Main class
    {
        //this keyword:- this means Current object.
        this.make/*this variables are the variables of the Car(Present class)*/ = make;
        this.price = price;//These both variables are different.
        this.year= year ;
        this.color = color;
    }
}