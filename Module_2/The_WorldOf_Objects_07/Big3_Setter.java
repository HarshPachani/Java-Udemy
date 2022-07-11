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
    public Big3_Setter(String make, double price, int year, String color){
        //this keyword:- this means Current object.
        this.make = make;
        this.price = price;
        this.year= year ;
        this.color = color;
    }
    private String make;
    private double price;
    private int year;
    private String color;

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
}
