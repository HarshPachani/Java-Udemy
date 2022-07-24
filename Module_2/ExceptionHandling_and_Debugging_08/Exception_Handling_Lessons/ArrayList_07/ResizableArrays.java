package com.Udemy.Module_2.ExceptionHandling_and_Debugging_08.Exception_Handling_Lessons.ArrayList_07;

//ArrayList is Resizable.
//we can add or remove elements
//it can only store objects. It cannot store Primitives.
//Method of declaring an ArrayList.
/*
    ArrayList<class type> collection = new ArrayList <class type>();

    1. Write the type: ArrayList.
    2. Generics <> specify what it can store.
        - Generics <> can only accept class types.
        - Generics <> cannot accept Primitive.
        EX:-
            ArrayList<int> num = new ArrayList <int>(); --> This is wrong.
            ArrayList<Integer> num = new ArrayList <Integer>(); --> This is right.
    3. Create a new object of the ArrayList class.

 */
import java.util.ArrayList;

public class ResizableArrays {
    public static void printArray(ArrayList<String> names){
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Joe");
        names.add("Jim");
        names.add("John");

        printArray(names);

        System.out.println("After Updating name, the Array is: ");
        names.set(0,"Joe Fresh"); //for updating the names.
        printArray(names);

        System.out.println("After Adding name, the Array is: ");
        names.add(3,"Kattie");
        printArray(names);

        System.out.println("After Removing name, the Array is: ");
        names.remove(2);
        printArray(names);

        System.out.println("After Clearing Every Elements, the Array is: ");
        names.clear();
        printArray(names);
    }
}
