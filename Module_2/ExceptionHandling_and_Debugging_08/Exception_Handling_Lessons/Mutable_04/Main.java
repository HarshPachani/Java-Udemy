package com.Udemy.Module_2.ExceptionHandling_and_Debugging_08.Exception_Handling_Lessons.Mutable_04;

//name for Setter is Mutator.
//Mutable object:- A Mutable object is an object whose field value can change Or object that can update its fields.
//Mutable objects uses mutators(setters) to update fields.

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Nissan", 10000);
        car.setMake("Honda");
    }
}
