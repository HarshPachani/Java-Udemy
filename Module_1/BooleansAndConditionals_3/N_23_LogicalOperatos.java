package com.Udemy.Module_1.BooleansAndConditionals_3;

public class N_23_LogicalOperatos {
    public static void main(String[] args) {
        //Logical OR operator.
        int chemistry = 78;
        int english = 65;
        String language = "Java";

        if (chemistry > 75 || english > 75 || language.equals("Java")){
            System.out.println("Congratulations, You got the Scholarship!");
        }else {
            System.out.println("we're sorry, You didn't get the Scholarship!");
        }

        //Logical And Operator.
        int credit = 56;
        double GPA = 3.2;

        if(credit >= 40 && GPA >= 2.0){
            System.out.println("You Earned your Engineering!");
        }else {
            System.out.println("Sorry, you need at least 40 credits and a minimum GPA of 2.0");
        }
    }
}
