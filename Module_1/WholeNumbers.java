package com.Udemy;

public class WholeNumbers {
    public static void main(String[] args) {
        int numberOfFans = 5000;
        System.out.println("There are "+numberOfFans+" fans at the Quidditch games");

//        int globalPopulation = 7000000000;//This will throw an error because the maximum range of the int is 2 billions.
        //For this reason we have long type.
        long globalPopulation = 7000000000L; //This l is for showing java that we are declaring the long number.
        //9 Quintillion is the maximum range of long.
        System.out.println("There are "+globalPopulation+" People on Earth");

        long dailygoogleSearches = 500000000000L;
        System.out.println("Daily, there are "+dailygoogleSearches+" google searches");
    }
}
