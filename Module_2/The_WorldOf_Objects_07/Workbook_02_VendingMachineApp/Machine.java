package com.Udemy.Module_2.The_WorldOf_Objects_07.Workbook_02_VendingMachineApp;

public class Machine {
    int item;
        /**
         * Function name – dispense
         * @param row (int)
         * @param spot (int)
         * @return (boolean)
         *
         * Inside the function:
         *  1. Checks if the requested item has a quantity bigger than 0.
         *      • if so: decreases its quantity by one and returns true.
         *      • otherwise: returns false.
         */
        public boolean dispense(int row, int spot){
            if (item > 0){
                item++;
                return true;
            }else {
                return false;
            }
        }
}
