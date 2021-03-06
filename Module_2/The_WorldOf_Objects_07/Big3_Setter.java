package com.Udemy.Module_2.The_WorldOf_Objects_07;

//Setter: Setter is a Method(function) that updates a field.
//Ex:- public void setMake(String make){
//  this.make = make;
// }
//Setter is a 1. Public
//            2. is lowerCamelCase
//            3. receives a Parameter
//            4. updates the field with a parameter

public class Big3_Setter {
    private String make;
    private double price;
    private int year;
    private String color;
    public Big3_Setter(String make, double price, int year, String color){
        //this keyword:- this means Current object.
        this.make = make;
        this.price = price;
        this.year= year ;
        this.color = color;
    }

    public Big3_Setter(Big3_Setter source){
        this.make = source.make;
        this.price = source.price;
        this.year =source.year;
        this.color = source.color;
    }

    public void setMake(String make){
        this.make = make;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String getMake(){
        return this.make;   //it's ok if we don't use this in the getters.
    }
    public double getPrice(){
        return this.price;
    }
    public int getYear(){
        return this.year;
    }
    public String getColor(){
        return this.color;
    }

    public void drive(){
        System.out.println("You bought the beautiful " + this.year + " " + this.color+ " " + this.make+ " for " + this.price + ".");
        System.out.println("Please drive your car to the nearest exit.\n");
    }
}
