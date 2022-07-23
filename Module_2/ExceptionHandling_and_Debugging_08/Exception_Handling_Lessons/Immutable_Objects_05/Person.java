package com.Udemy.Module_2.ExceptionHandling_and_Debugging_08.Exception_Handling_Lessons.Immutable_Objects_05;

public class Person {
    private String name;
    private String nationality;

    public Person(String name, String nationality) {
        if (name == null || name.isBlank() || nationality == null || nationality.isBlank()) {
            throw new IllegalArgumentException("fields cannot be null/blank");
        }
        this.name = name;
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public String getNationality() {
        return nationality;
    }


}
