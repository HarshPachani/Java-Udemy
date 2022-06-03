package com.Udemy.Module_1.Arrays_6;

import java.util.Arrays;

public class N_14_ReferenceTrap {
    public static void main(String[] args) {
        String[] staffLastYear = {"Tommy","Joel","Ellie"};
        //String[] staffThisYear = staffLastYear;
        //staffThisYear[1] = "Abby";
        //here if we will change anything in staffThisYear array than the
        //staffLastYear will be changed automatically, this is known as the Reference Trap.

        //The solution of the reference trap is to make a new array manually and copy all the array element using for loop.
        /*String[] staffThisYear = new String[staffLastYear.length];

        for (int i=0;i < staffThisYear.length; i++){
            staffThisYear[i] = staffLastYear[i];
        }
        staffThisYear[1] = "Abby";*/

        String[] staffThisYear = Arrays.copyOf(staffLastYear,staffLastYear.length); //This copy one array into another (Inbuilt for loop).
        staffThisYear[1] = "Abby";

        System.out.println(Arrays.toString(staffLastYear));
        System.out.println(Arrays.toString(staffThisYear));
    }
}
