package com.Udemy.Module_1.Function_4;
//Intro of the Function.

public class N_32_Chorus {
    public static void main(String[] args) {
        singChorus();
        singChorus();
        singChorus();
    }

    //There is static in this singChorus function because we are calling this function
    // from main method which is as we know static, so we have to write static in the function.
    public static void singChorus(){
        System.out.println("Don't blame it on the sunshine");
        System.out.println("Don't blame it on moonlight");
        System.out.println("Don't blame it on good times");
        System.out.println("Blame it on the boogie\n");
    }
}
