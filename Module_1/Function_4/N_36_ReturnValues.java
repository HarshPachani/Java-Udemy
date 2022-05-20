package com.Udemy.Module_1.Function_4;

public class N_36_ReturnValues {
    public static void main(String[] args) {
        double measure1 = measureRectangle(2.2,4.3,"area");
        double measure2 = measureRectangle(3.2,4.1,"parameter");

        stringPrinter(2.2,4.3,measure1,"area");
        stringPrinter(3.2,4.1,measure2,"perimeter");

    }
    public static double measureRectangle(double length,double width,String option){
        if(length < 0 || width < 0 ){
            System.out.println("Length or Width cannot be negetive");
            System.exit(0); //This Exit the Application.
        }
        switch (option){
            case "area":return length * width;  //we don't need to add a break keyword here, because of the return.
            case "parameter":return 2 * (length + width);
            default:return 404;
        }

    }

    public static void stringPrinter(double length, double width, double area,String option){
        System.out.println("The "+ option +" of the Rectangle with length "+ length + " and width "+ width + " is equal to "+ area + "\n");
    }
}
