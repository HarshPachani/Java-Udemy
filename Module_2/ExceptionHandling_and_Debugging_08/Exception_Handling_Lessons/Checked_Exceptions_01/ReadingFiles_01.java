package com.Udemy.Module_2.ExceptionHandling_and_Debugging_08.Exception_Handling_Lessons.Checked_Exceptions_01;//package com.Udemy.Module_2.ExceptionHandling_and_Debugging_08.Exception_Handling_Lessons.Checked_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFiles_01 {
    public static void main(String[] args) throws FileNotFoundException {
        try{
            FileInputStream fis = new FileInputStream("Greetings.txt");
            Scanner scan = new Scanner(fis); //Read the file's data using Scanner. and it's gonna input the FileInputStream,
            //And that's we gave the reference of the FileInputStream.
            while (scan.hasNextLine()){
                System.out.println(scan.nextLine());
            }//to read the data from the file to read each and every line until the end of file.
            scan.close();
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        
    }
}
