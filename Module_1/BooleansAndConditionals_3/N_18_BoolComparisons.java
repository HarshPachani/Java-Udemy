package com.Udemy.Module_1.BooleansAndConditionals_3;

public class N_18_BoolComparisons {
    public static void main(String[] args) {

        int chemistryGrade = 95;
        int biologyGrade = 75;
        int englishGrade = 75;
        System.out.println(chemistryGrade != englishGrade);
        System.out.println(biologyGrade == englishGrade);

        double sales = 37.55;
        double cost = 5.55;
        System.out.println(sales < cost);

        //Comparisons for Strings.
        //we use equals method to comparison the String
        //This checks if String values are equal.
        //NOTE:- Never use == or != to compare String values, you will get weird results.
        String sentance1 = "I love this course!";
        String sentance2 = "I love this course!";
        System.out.println(sentance1.equals(sentance2));
        System.out.println(!sentance1.equals(sentance2));

    }
}
