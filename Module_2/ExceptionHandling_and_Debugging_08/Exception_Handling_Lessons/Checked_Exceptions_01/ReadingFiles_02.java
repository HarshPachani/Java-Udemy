package com.Udemy.Module_2.ExceptionHandling_and_Debugging_08.Exception_Handling_Lessons.Checked_Exceptions_01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFiles_02 {
    public static void main(String[] args) {
        try{
            loadData("Greetings.txt");    
        }
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }

    public static void loadData(String name) throws FileNotFoundException{
            FileInputStream fis = new FileInputStream(name);
            Scanner scan = new Scanner(fis);
            while (scan.hasNextLine()) {
                System.out.println(scan.nextLine());
            }
            scan.close();
    }

}
