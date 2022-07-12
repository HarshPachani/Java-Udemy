package com.Udemy.Module_2.The_WorldOf_Objects_07;
//toString :- toString is a method that returns every field as one string. or toString connects every field into a String.

import java.util.Arrays;

public class TheBig03UpdateClass {
    private String make;
    private double price;
    private int year;
    private String color;
    private String[] parts;
    public TheBig03UpdateClass(String make, double price, int year, String color, String[] parts){
        //this keyword:- this means Current object.
        this.make = make;
        this.price = price;
        this.year= year ;
        this.color = color;
        //this.parts = parts; //This is reference trap for an array, These are sharing a same reference.
        //The solution:
        this.parts = Arrays.copyOf(parts, parts.length); //we copied every array element into the another array.
    }

    public TheBig03UpdateClass(TheBig03UpdateClass source){
        this.make = source.make;
        this.price = source.price;
        this.year =source.year;
        this.color = source.color;
        this.parts = Arrays.copyOf(source.parts,source.parts.length);
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
    public void setParts(String[] parts){
        this.parts = Arrays.copyOf(parts, parts.length);
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
    public String[] getParts(){
        return Arrays.copyOf(this.parts, this.parts.length); //so that we cannot change the variable from the outside.
        //we will return only the copy of the Array.
    }

    public void drive(){
        System.out.println("You bought the beautiful " + this.year + " " + this.color+ " " + this.make+ " for " + this.price + ".");
        System.out.println("Please drive your car to the nearest exit.\n");
    }

    public String toString(){
        return "Make: "+this.make + ".\n" +
                "Price: " +this.price + ".\n" +
                "Year: " +this.year + ".\n" +
                "Color: " + this.color + ".\n" +
                "Parts: " +Arrays.toString(parts);
    }
}
