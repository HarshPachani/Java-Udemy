package com.Udemy;

public class N_25_WB3Point5_WorkSchedule {
    public static void main(String[] args) {
        // if it's a holiday, print: "woohoo, no work!");
        // if it's the weekend, print: "it's the weekend, no work!"
        // otherwise, print: "Wake up at 7:00 :( ";

        int day = 3;
        boolean holiday = true;
        if(holiday) {
            System.out.println("woohoo, no work!");
        } else if (day == 6 || day == 7) {
            System.out.println("it's the weekend, no work!");
        }
        else{
            System.out.println("Wake up at 7:00 :( ");
        }
    }
}