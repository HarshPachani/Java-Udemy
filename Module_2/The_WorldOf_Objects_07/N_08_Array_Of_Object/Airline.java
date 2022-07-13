package com.Udemy.Module_2.The_WorldOf_Objects_07.N_08_Array_Of_Object;

public class Airline {
    Person[] seats;
    public Airline(){
        this.seats = new Person[11];
    }

    public Person getPerson(int index){
        return  new Person(this.seats[index]);
    }
    public void setPerson(Person person){
        this.seats[person.getSeatNumber()] = new Person(person);
    }
}
