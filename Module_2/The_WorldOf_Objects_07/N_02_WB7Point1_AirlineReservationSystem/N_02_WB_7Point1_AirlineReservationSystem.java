package com.Udemy.Module_2.The_WorldOf_Objects_07.N_02_WB7Point1_AirlineReservationSystem;

import java.util.Arrays;

public class N_02_WB_7Point1_AirlineReservationSystem {
    public static void main(String[] args) {
        Person_N_02 person = new Person_N_02();
        person.name = "Harsh";
        person.nationality = "Indian";
        person.dateOfBirth = "09/05/2003";
        person.passport = new String[]{person.name , person.nationality , person.dateOfBirth};
        person.seatNumber = 5;

        System.out.println("Name: " + person.name);
        System.out.println("Nationality:" + person.nationality);
        System.out.println("DateOfBirth:" + person.dateOfBirth);
        System.out.println("Passport Details:" + Arrays.toString(person.passport));
        System.out.println("SeatNumber:" + person.seatNumber);
    }
}
