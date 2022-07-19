package com.Udemy.Module_2.ExceptionHandling_and_Debugging_08.Exception_Handling_Lessons.Throwing_UncheckedExceptions_03.Models;

public class Employee {
        private String name;
        private String position;

        public Employee(String name, String position) {
            this.name = name;
            this.position = position;
        }
        public Employee(Employee source) {
            this.name = source.name;
            this.position = source.position;
        }

        public String getName() {
            return name;
        }

        public String getPosition() {
            return position;
        }

        public String toString() {

            return "\tName: " + name + "\tPosition: " + this.position + "\n";
        }
}
