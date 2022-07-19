package com.Udemy.Module_2.ExceptionHandling_and_Debugging_08.Exception_Handling_Lessons.Throwing_UncheckedExceptions_03.Models;

public class Store {
        Employee[] employees;

        public Store() {
            employees = new Employee[3];
        }

        public void setEmployees(int index, Employee employee) {
            this.employees[index] = new Employee(employee);
        }

        public void open() {
            System.out.println("We're open for business!");
        }

        public String toString() {
            String temp = "";
            for (int i = 0; i < employees.length; i++) {
                temp += employees[i] != null ? employees[i].toString() : "";
                temp += "\n";
            }
            return temp;
        }
}
