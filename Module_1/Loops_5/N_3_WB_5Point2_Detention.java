package com.Udemy.Module_1.Loops_5;

import java.util.Scanner;

public class N_3_WB_5Point2_Detention {
    public static void main(String[] args) {
        System.out.println("Hi Harsh. I can write lines for you.\nWhat do you want me to write?");
        //Task 1 – Scan for the nextLine(), and print it 99 times.
        Scanner  scan = new Scanner(System.in);
        String line = scan.nextLine();

        for (int i=1;i<=99;i++){
            System.out.println(i + ". " + line);
        }

        scan.close();
    }
}
