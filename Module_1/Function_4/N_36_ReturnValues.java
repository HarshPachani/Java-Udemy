package com.Udemy.Module_1.Function_4;

public class N_36_ReturnValues {
    public static void main(String[] args) {
        double measure1 = measureRectangle(2.2,4.3);
        double measure2 = measureRectangle(3.2,4.9);
        double measure3 = measureRectangle(3.5,4.5);
        double measure4 = measureRectangle(2.3,4.2);
        stringPrinter(2.2,4.3,measure1);
        stringPrinter(3.2,4.9,measure2);
        stringPrinter(3.5,4.5,measure3);
        stringPrinter(2.3,4.2,measure4);
    }
    public static double measureRectangle(double length,double width){
        double area = length * width;
        return area;
    }

    public static void stringPrinter(double length, double width, double area){
        System.out.println("The area of the Rectangle with length "+ length + " and width "+ width + " is equal to "+ area + "\n");
    }
}
