package com.Udemy.Module_2.ExceptionHandling_and_Debugging_08.Exception_Handling_Lessons.Mutable_04;

//name for Setter is Mutator.
//Mutable object:- A Mutable object is an object whose field value can change Or object that can update its fields.
//Mutable objects uses mutators(setters) to update fields.

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Nissan", 10000);
        car.setMake("Honda");
        Car car2 = car;
        car2.setPrice(8000); //this will create a reference trap.

        System.out.println(car.getPrice());
        System.out.println(car2.getPrice());
    }
}
