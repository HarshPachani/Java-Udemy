package com.Udemy.Module_2.ExceptionHandling_and_Debugging_08.Exception_Handling_Lessons.Immutable_Objects_05;

//Immutable objects:- Objects is an object whose field values cannot change.
//It does not have setters or mutators.

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Ryan", "Canadian"); //The person object is immutable object.
        Person person2 = person;
        person2 = new Person("John", "American");
    }

}
