package com.Udemy.Module_1.Function_4;

public class N_39_BuiltIn_Functions {
    public static void main(String[] args) {
        System.out.println("Hello Java");//Here println is a Java builtIn function.

        double sine = Math.sin(1.2);
        System.out.println("The sin of 1.2 is: "+sine);

        double power = Math.pow(2,4);
        System.out.println("2 to the power 4 is: "+power);

        //random function --> BuiltIn Math function.
        //random function --> Returns a random number between 0 and less than 1.

        //This will only return the number between 0 and less than 1
        //double random = Math.random();

        //This will return between 0 and 100 , because we multiplied that number with 100.
        double random = Math.random() * 100;
        int ran = (int)random;  //To convert decimal to an integer.
        System.out.println("The random value is: " + random);
        System.out.println("The random value is: " + ran);
    }
}
