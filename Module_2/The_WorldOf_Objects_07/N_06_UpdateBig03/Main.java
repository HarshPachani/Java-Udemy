package com.Udemy.Module_2.The_WorldOf_Objects_07.N_06_UpdateBig03;

import java.util.Arrays;

public class Main {
        public static void main(String[] args) {


            Person person = new Person("Harsh Pachani", "Indian", "09/05/2003", 16);

            if (person.applyPassport() == true) {
                person.setPassport();
            }

            System.out.println("Name: " + person.getName() + "\n"
                    +  "Nationality: " + person.getNationality() + "\n"
                    +  "Date of Birth: " + person.getDateOfBirth() + "\n"
                    +  "Seat Number: " + person.getSeatNumber() + "\n"
                    +  "Passport: " + Arrays.toString(person.getPassport()) + "\n");
        }
}
