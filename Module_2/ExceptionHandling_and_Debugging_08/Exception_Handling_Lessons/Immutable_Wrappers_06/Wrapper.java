package com.Udemy.Module_2.ExceptionHandling_and_Debugging_08.Exception_Handling_Lessons.Immutable_Wrappers_06;

//Wrapper:- A Wrapper is an immutable class that wraps around a primitive type.
//Ex:- Integer  -> Immutable class that wraps around int.
//          OR
/* Integer is an immutable class that wraps around the type because integer is an immutable class, then variables of that type store a reference to an object.
They can be null, they can call methods, but they cannot change. which means they are immune to the reference trap.*/

public class Wrapper {
    public static void main(String[] args) {
        //int wholeNumber = 5;
        Integer wholeNumber = new Integer(5); //These both are same, the difference is we are using a class of an int.
        // Integer wholeNumber = 5; //or we can write like this either.

        Integer numberTwo = wholeNumber;
        numberTwo = 10;

        System.out.println(wholeNumber);
        System.out.println(numberTwo);

        //long largeWholeNumber = 5000000000L;
        Long largewholeNumber = new Long(5000000000L);

        //double decimal = 5.493;
        Double decimal = new Double(5.493);

        //char letter = 'b';
        Character letter = new Character('b');
    }
}
/*When to use Primitive vs Wrapper:-
    - Use Primitive 90 % of time. (because Primitive is faster than Wrapper).
    - Use Wrapper only when you need to Examples:-
        - Needs to be nullable.
        - Nedds to call methods.




 */
