package com.Udemy.Module_2.The_WorldOf_Objects_07;
//The Dealership class is a Manager class.
//The Manager class manages objects of another class.
/*
Requirements:-
  .The dealership sells many types of cars.
  .A car is defined by it's make, price, year and color.
  .Every car needs to come with square parts.
  .The dealership app should be able to search for cars based on make and price.
  .After a sale, the car must drive to the nearest exit.
*/

public class Dealership {
        private Car[] cars; //An array of objects.

    public Dealership(){
        this.cars = new Car[3];
    }

    /*public void setCars(Car[] cars) {
        this.cars = cars;
    }*/
    //Side Note:
    //   .This is typical to a class that manages an array of objects.
    //   .The array is likely to hold many objects.
    //The Solution:
    public void setCar(Car car,int index){
        this.cars[index] = new Car(car); //to bypass the reference trap so we created a new object for it.
    }

}
