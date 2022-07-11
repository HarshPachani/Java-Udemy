package com.Udemy.Module_2.The_WorldOf_Objects_07;

//Getter:- Getter is a Method(function) that returns a field's value.
//Ex:- public String getBrand(){
//      return this.brand;
// }
//A getter is 1. Public
//            2. Always in lowerCamelCase
//            3. returns the field's value.

public class Big2_Getter {

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
        public Big2_Getter(String make, double price, int year, String color){
            //this keyword:- this means Current object.
            this.make = make;
            this.price = price;
            this.year= year ;
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
