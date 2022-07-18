package com.Udemy.Module_2.ExceptionHandling_and_Debugging_08.Exception_Handling_Lessons.Checked_Exceptions;

import java.io.FileInputStream;

public class ReadingFiles_01 {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("Greetings.txt");

    }
}
