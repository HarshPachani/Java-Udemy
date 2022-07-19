package com.Udemy.Module_2.ExceptionHandling_and_Debugging_08.Exception_Handling_Lessons.Throwing_UncheckedExceptions_03;

//First Java doesn't recognize the Employee and Store class because it is in different packages, so we need to import the package.
import com.Udemy.Module_2.ExceptionHandling_and_Debugging_08.Exception_Handling_Lessons.Throwing_UncheckedExceptions_03.Models.Employee;
import com.Udemy.Module_2.ExceptionHandling_and_Debugging_08.Exception_Handling_Lessons.Throwing_UncheckedExceptions_03.Models.Store;

//Why do we throw an unchecked exceptions?
/*
    ->  We throw unchecked exceptions that prevent the caller from misusing methods or constructors.
*/

/*The Most common exceptions to throw:
    -> IllegalArgumentException.
    -> IllegalStateException.
*/

//IllegalStateException:- is thrown if an object of the method call with an illegal state.
public class Main {
        public static void main(String[] args) {
            Employee stocker = new Employee("Paul", "Stocker");
            Employee stokerCopy = new Employee(stocker);
            Employee assisManager = new Employee("Nicholas", "Assistant Manager");
            Employee manager = new Employee("Demian", "Manager");

            Store store = new Store();

            //If we don't setEmployees in the store than the application will crash due to IllegalStateException.
            store.setEmployees(0, stocker);
            store.setEmployees(1, assisManager);
            store.setEmployees(2, manager);

            System.out.println(store);
            store.open();

        }
}
