package com.Udemy.Module_1.Loops_5;

public class N_13_BreakAndContinue {
    public static void main(String[] args) {
        for (int i = 0;i<=10; i++){
            if(i % 2 != 0){
                continue;
                //break;
            }
            System.out.println(i);
        }
    }
}
