package com.Udemy.Module_2.The_WorldOf_Objects_07.N_03_WB7Point2_Dealership;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Harsh Pachani", "Indian", "09/05/2003", 36);
        System.out.println("Name: "+ person.name + "\n" +
                            "Nationality: "+ person.nationality + "\n"+
                            "Date Of Birth: "+ person.dateOfBirth + "\n" +
                            "Seat Number: "+ person.seatNumber + "\n");
    }
}

