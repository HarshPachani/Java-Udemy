package com.Udemy.Module_2.ExceptionHandling_and_Debugging_08.Exception_Handling_Lessons.UncheckedExceptions;

public class RuntimeException2 {
    //This is showing NullPointerException.
    public static void main(String[] args){
        String[] word = null;
        if (word == null){
            System.out.println("The word is null");
        }else {
           // word.toLowerCase();
        }

    }
}
