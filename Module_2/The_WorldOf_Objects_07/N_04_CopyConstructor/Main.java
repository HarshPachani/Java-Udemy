package com.Udemy.Module_2.The_WorldOf_Objects_07.N_04_CopyConstructor;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Harsh Pachani", "Indian", "09/05/2003", 36);
        person.setSeatNumber(16);
        System.out.println("Name: "+ person.getName() + "\n" +
                "Nationality: "+ person.getNationality() + "\n"+
                "Date Of Birth: "+ person.getDateOfBirth() + "\n" +
                "Seat Number: "+ person.getSeatnumber() + "\n");

        Person person2 = new Person(person);
        person2.setName("Pachani Harsh");
        person2.setSeatNumber(11);
        System.out.println("Name: "+ person2.getName() + "\n" +
                "Nationality: "+ person2.getNationality() + "\n"+
                "Date Of Birth: "+ person2.getDateOfBirth() + "\n" +
                "Seat Number: "+ person2.getSeatnumber() + "\n");
    }
}
