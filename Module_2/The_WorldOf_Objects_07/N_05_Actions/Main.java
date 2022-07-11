package com.Udemy.Module_2.The_WorldOf_Objects_07.N_05_Actions;

public class Main {
        public static void main(String[] args) {

            Person person = new Person("Harsh Pachani", "Indian", "09/05/2003", 36);
            person.chooseSeat();

            System.out.println("Name: " + person.getName() + "\n"
                    +                  "Nationality: " + person.getNationality() + "\n"
                    +                  "Date of Birth: " + person.getDateOfBirth() + "\n"
                    +                  "Seat Number: " + person.getSeatNumber() + "\n");

            if (person.applyPassport() == true) {
                System.out.println("Congratulations " + person.getName() + ". Your passport was approved!");
            } else {
                System.out.println("We're sorry " + person.getName() + ". We cannot process your application.");
            }
        }
}
