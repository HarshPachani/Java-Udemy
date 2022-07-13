package com.Udemy.Module_2.The_WorldOf_Objects_07.N_08_Array_Of_Object;

public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[]{
                new Person("Harsh", "India", "9503", 0),
                new Person("Harsh", "India", "9503", 1),
                new Person("Harsh", "India", "9503", 2),
                new Person("Harsh", "India", "9503", 3),
                new Person("Harsh", "India", "9503", 4),
                new Person("Harsh", "India", "9503", 5),
                new Person("Harsh", "India", "9503", 6),
                new Person("Harsh", "India", "9503", 7),
                new Person("Harsh", "India", "9503", 8),
                new Person("Harsh", "India", "9503", 9),
                new Person("Harsh", "India", "9503", 10),
        };

        Airline airline = new Airline();

        for (int i = 0; i < people.length; i++) {
            airline.setPerson(people[i]);
        }

        System.out.println(airline.getPerson(1));
        System.out.println(airline.getPerson(5));
        System.out.println(airline.getPerson(9));
    }
}
