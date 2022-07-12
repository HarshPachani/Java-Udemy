package com.Udemy.Module_2.The_WorldOf_Objects_07.N_07_toString;
//toString :- toString is a method that returns every field as one string.
//                  OR
// toString connects every field into a String.

public class Main {
    public static void main(String[] args) {

            Person person = new Person("Harsh Pachani", "Indian", "09/05/2003", 36);

            if (person.applyPassport() == true) {
                person.setPassport();
            }

            System.out.println(person);
        }
}
