package com.Udemy.Module_2.The_WorldOf_Objects_07.N_05_Actions;

public class Person {
        private String name;
        private String nationality;
        private String dateOfBirth;
        private String[] passport;
        private int seatNumber;

        //Constructor for initially assign the value.
        public Person(String name, String nationality, String dateOfBirth, int seatNumber) {
            this.name = name;
            this.nationality = nationality;
            this.dateOfBirth = dateOfBirth;
            this.seatNumber = seatNumber;
        }

        //Copy Constructor for copy the one constructor into another.
        public Person(Person source) {
            this.name = source.name;
            this.nationality = source.nationality;
            this.dateOfBirth = source.dateOfBirth;
            this.seatNumber = source.seatNumber;
        }

        //For accessing the private Variables.
        public String getName() {
            return this.name;
        }

        public String getNationality() {
            return this.nationality;
        }

        public String getDateOfBirth() {
            return this.dateOfBirth;
        }

        public int getSeatNumber() {
            return this.seatNumber;
        }

        public void setName(String name) {
            this.name = name;
        }

        //for changing the Variable value.
        public void setNationality(String nationality) {
            this.nationality = nationality;
        }

        public void setDateOfBirth(String dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
        }

        public void setSeatNumber(int seatNumber) {
            this.seatNumber = seatNumber;
        }

        public boolean applyPassport() {
            int number = (int) (Math.random() * 2);  //random int that can be 0 or 1.
            if (number == 0) {
                return false;
            } else {
                return true;
            }
        }

        public void chooseSeat() {
            this.seatNumber = (int) (Math.random() * 11 + 1); //range of 1 to 11.
        }
}
