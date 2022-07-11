package com.Udemy.Module_2.The_WorldOf_Objects_07.N_04_CopyConstructor;

public class Person {
    private String name;
    private String nationality;
    private String dateOfBirth;
    private String[] passport;
    int seatNumber;

    public Person(String name, String nationality, String dateOfBirth, int seatNumber){
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.seatNumber = seatNumber;
    }

    public Person(Person source){
        this.name = source.name;
        this.nationality= source.nationality;
        this.dateOfBirth = source.dateOfBirth;
        this.seatNumber = source.seatNumber;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setNationality(String nationality){
        this.nationality = nationality;
    }
    public void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }
    public void setSeatNumber(int seatNumber){
        this.seatNumber = seatNumber;
    }

    public String getName(){
        return this.name;
    }
    public String getNationality(){
        return this.nationality;
    }
    public String getDateOfBirth(){
        return this.dateOfBirth;
    }
    public int getSeatnumber(){
        return this.seatNumber;
    }

}
