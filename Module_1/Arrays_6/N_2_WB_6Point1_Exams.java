package com.Udemy.Module_1.Arrays_6;

public class N_2_WB_6Point1_Exams {
    public static void main(String[] args) {
        //Task 1: Create an array that stores 5 students: "Harry", "Neville", "Ron", "Hermione", "Seamus"
        String[] students = {"Harry" , "Neville" , "Ron" , "Hermione" , "seamus"};

        //Task 2: Assign each student a seat according to their index in the array.
        //           print: " <student at index 0> ", you will take seat 0.
        System.out.println("It's time to take your 5th year exams. Please, take your seats.\n");

        System.out.println(students[0] + " You will take seat " + 0);
        System.out.println(students[1] + " You will take seat " + 1);
        System.out.println(students[2] + " You will take seat " + 2);
        System.out.println(students[3] + " You will take seat " + 3);
        System.out.println(students[4] + " You will take seat " + 4);
    }
}
