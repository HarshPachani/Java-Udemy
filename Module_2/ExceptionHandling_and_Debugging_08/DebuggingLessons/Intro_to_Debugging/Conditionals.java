//package com.Udemy.Module_2.ExceptionHandling_and_Debugging_08.DebuggingLessons.Intro_to_Debugging;

public class Conditionals {
    //here the problem is that every time it is giving the fold as an output and that's why we can use the debugger to solve it,
    //we can visualize the behind the scene of the code like what is happening behind the scene, so we can solve it.
    //hence here, we will need a visual studio code for it.
    //Using breakpoint we can visualize the runtime, so we are just add breakpoints everywhere for now(by clicking on the red dot showing before the number of line).
    //Now after applying breakpoints, we will launch a new debugging session.
    //for launching new debugging session click on Run and Debug(ctrl + shift + D). and you will see an option like create a launch.json file.
    //After launching new debugging session you will see the new window at the left corner.
    //click on launch current file.


        public static void main(String[] args) {
            String option = "";

            int random = (int) (Math.random() * 3 + 1);

            switch (random) {
                case 1: option = "hit";break;
                case 2: option = "stay";break;
                case 3: option = "fold";break;
                default: option = "This should never get called";
            }


            if (!option.equals("hit") && !option.equals("stay")) {
                System.out.println("fold");
            } else {
                System.out.println(option);
            }
        }
}
