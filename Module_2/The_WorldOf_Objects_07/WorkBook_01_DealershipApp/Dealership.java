package com.Udemy.Module_2.The_WorldOf_Objects_07.WorkBook_01_DealershipApp;

//The Dealership class is a Manager class, a manager class manages an objects of another class.
//The work of the Dealership is to Show the available cars in a Budget and Sell a car.

public class Dealership {
        private Car[] cars;//This creates an array that can store number of car objects.

        public Dealership(Car[] cars) {
            this.cars = new Car[cars.length];
            for (int i = 0; i < cars.length; i++) {
                this.cars[i] = new Car(cars[i]);
            }
        }

        public void setCar(Car car, int index) {
            this.cars[index] = new Car(car);
        }

        public Car getCar(int index) {//because it is gonna return a Car object, hence we use public Car in here.
            return new Car(this.cars[index]); //new Car(this.cars[index]{this is source object}) is the copy constructor
        }

        public void sell(int index) {
            this.cars[index].drive();
            this.cars[index] = null;
        }

        /**
         * Task 2 - Re-write the search action.
         * Function name: search
         *
         * @param make   (String)
         * @param budget (int)
         * @return (int)
         * <p>
         * Inside the function:
         * 1. Loops through every element in the cars field.
         * 2. Skips the run if the element is null.
         * 3. If it finds a car the user can afford:
         * • println: \nWe found a car in spot <i> \n\n <toString>
         * • print: If you're interested, type 'yes':
         * • returns the index
         * 4. If the loop runs and it didn't find a car
         * • println: \nYour search didn't match any results.\n
         * • returns 404
         */
        public int search(String make, int budget) {
            for (int i = 0; i < this.cars.length; i++) {
                if (this.cars[i] == null) {
                    continue;
                } else if (this.cars[i].getMake().equalsIgnoreCase(make) && this.cars[i].getPrice() <= budget) {
                    System.out.println("\nWe found one in spot "+ i + "\n" + this.cars[i].toString() + "\nAre you interested ?");
                    return i;
                }
            }
            System.out.println("Your search didn't match any results.");
            return 404;
        }

        public String toString() {
            String temp = "";
            for (int i = 0; i < this.cars.length; i++) {
                temp += "Parking Spot: " + i + "\n";
                if (this.cars[i] == null) {
                    temp += "Empty\n";
                } else {
                    temp += this.cars[i].toString() + "\n";
                }
            }
            return temp;
        }
}
