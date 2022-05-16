package com.Udemy;

public class Bus {
    public static void main(String[] args) {
        String sentance = "Number of Passengers: ";
        int passengers = 0;

        passengers += 9;
        System.out.println(sentance+passengers);

        passengers -= 5;
        System.out.println(sentance+passengers);

        passengers -= 4;
        System.out.println(sentance+passengers);

        System.out.println("End of shift");
    }
}
