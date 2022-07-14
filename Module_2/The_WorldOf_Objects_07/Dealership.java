package com.Udemy.Module_2.The_WorldOf_Objects_07;
//The Dealership class is a Manager class.
//The Manager class manages objects of another class.
/*
Requirements:-
  •The dealership sells many types of cars.
  •A car is defined by it's make, price, year and color.
  •Every car needs to come with square parts.
  •The dealership app should be able to search for cars based on make and price.
  •After a sale, the car must drive to the nearest exit.
*/

public class Dealership {
        private TheBig03UpdateClass[] cars ; //An array of objects.

    //this is simple approach.

    /*public Dealership(){
        this.cars = new TheBig03UpdateClass[3];
    }*/
    //This is fixed constructor approach.
    //Here we fixed the dealership constructor of Dealership class and passed an array of an object and added a for loop in the constructor.
    public Dealership(TheBig03UpdateClass[] cars){
        this.cars = new TheBig03UpdateClass[cars.length];
        for (int i = 0; i < this.cars.length; i++) {
            this.cars[i] = new TheBig03UpdateClass(cars[i]);
        }
    }

    /*public void setCar(The_Big03To_Update[] cars) {
        this.cars = cars;
    }*/
    //Side Note:
    //   .This is typical to a class that manages an array of objects.
    //   .The array is likely to hold many objects.
    //The Solution:

    //setter
    public void setCar(TheBig03UpdateClass car,int index){
        this.cars[index] = new TheBig03UpdateClass(car); //to bypass the reference trap so we created a new object for it.
    }

    //getter
    public TheBig03UpdateClass getCar(int index){
        return new TheBig03UpdateClass(this.cars[index]);
    }

    //Add sell action to sell the car.
    public void sell(int index){
        this.cars[index].drive();
        this.cars[index] = null;
    }

    //Add Search action to search the car.
    public String search(String make, int budget){
        for (int i = 0; i < this.cars.length; i++) {
            //if some of the objects are null and we try to access it from the dot(.) syntax then java will throw an exception and will crash.
            //so the Solution is:
            if (this.cars[i] == null){
                continue; //To skip that null object.
            }else if (this.cars[i].getMake().equals(make) && this.cars[i].getPrice() <= budget){
                return "\nWe found one in spot " + i + "\n" + this.cars[i].toString() + "\nAre you interested?";
            }
        }
        return "Sorry, we couldn't find any cars.";
    }

    //Add a toString method.
    public String toString(){
        String temp = "";
        for (int i = 0; i < this.cars.length; i++) {
            temp += "Parking Spot: " + i + "\n";
            if (this.cars[i] == null){
                temp += "Empty \n";
            }else {
                temp += this.cars[i].toString() + "\n\n";//for printing the details of the cars.
            }
        }
        return temp;
    }
}
