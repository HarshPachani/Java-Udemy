package com.Udemy.Module_2.ExceptionHandling_and_Debugging_08.Exception_Handling_Lessons.Throwing_UncheckedExceptions_03;

//First Java doesn't recognize the Employee and Store class because it is in different packages, so we need to import the package.
import com.Udemy.Module_2.ExceptionHandling_and_Debugging_08.Exception_Handling_Lessons.Throwing_UncheckedExceptions_03.Models.Employee;
import com.Udemy.Module_2.ExceptionHandling_and_Debugging_08.Exception_Handling_Lessons.Throwing_UncheckedExceptions_03.Models.Store;

public class Main {
        public static void main(String[] args) {
            Employee stocker = new Employee("   ", null);
            Employee assisManager = new Employee("Nicholas", "     ");
            Employee manager = new Employee(null, "      ");

            Store store = new Store();

            System.out.println(store);
            store.open();

        }
}
