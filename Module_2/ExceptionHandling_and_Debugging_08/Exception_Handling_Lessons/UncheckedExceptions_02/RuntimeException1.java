package com.Udemy.Module_2.ExceptionHandling_and_Debugging_08.Exception_Handling_Lessons.UncheckedExceptions_02;

public class RuntimeException1 {
    //This is showing ArrayIndexOutOfBoundsException.
    public static void main(String[] args) {
        int[] array = new int[3];
        /*try{
            System.out.println(array[5]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }*/
        //Never ever do this, try to catch exception fix the code instead.

        //Do this,
        System.out.println(array[2]);
    }
}
