package com.Udemy;

public class N_22_WB3Point3_Championship {
    public static void main(String[] args) {
        int gryffindor = 400;    //gryffindor points
        int ravenclaw = 200;    //ravenclaw points

        // int margin = amount of points by which gryffindor scored over ravenclaw;
        int margin = gryffindor-ravenclaw;

        //if gryffindor wins by a margin of 300 points:
        //print: Gryffindor takes the house cup!
        if (margin >= 300){
            System.out.println("Gryffindor takes the house cup!");
        }
        //if gryffindor wins by a margin of any points:
        // print: In second place, Gryffindor!
        else if (margin >= 0) {
            System.out.println("In second place, Gryfffindor");
        }
        //if gryffindor loses by a margin of 100 points, they are third:
        //print: In third place, Gryffindor!
        else if (margin >= -100) {
            System.out.println("In third place, Gryffindor!");
        }
        //else:
        //print: In fourth place, Gryffindor!
        else{
            System.out.println("In fourth place, Gryffindor!");
        }
    }
}
