package com.Udemy.Module_2.The_WorldOf_Objects_07.N_03_WB7Point3;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Harsh Pachani", "Indian", "09/05/2003", 36);
        person.setSeatNumber(10);
        System.out.println("Name: "+ person.getName() + "\n" +
                "Nationality: "+ person.getNationality() + "\n"+
                "Date Of Birth: "+ person.getDateOfBirth() + "\n" +
                "Seat Number: "+ person.getSeatnumber() + "\n");
    }
}
