package com.Udemy.Module_1.Arrays_6;

public class N_19_WB_6Point14_RandomNumbers {
    public static void main(String[] args) {
        // Task 3 – Create a 2D array with 100 rows and 10 columns.
        int[][] array2D = new int[100][10];

        /** Task 4
         * 1. Using a nested loop, populate the array with random numbers.
         * 2. Then, pass the updated array into print2DArray.
         */
        for (int i=0 ; i< array2D.length; i++){
            for (int j=0; j< array2D[i].length; j++){
                array2D[i][j] = randomNumber();
            }
        }

        print2DArray(array2D);
    }
    /** Task 1
     * Function name: randomNumber.
     *
     * @return randomNumber (int)
     *
     * Inside the function:
     *    1. return a random number between 1 and 100.
     */
    public static int randomNumber(){
        double random = Math.random() * 100;
        random += 1;
        return  (int)random;
    }

    /** Task 2
     * Function name: print2DArray
     * @param array ( int[][] )
     *
     * Inside the function:
     *
     *   1. prints the array such that:
     *        • Each row takes up one line.
     *        • There's a space between each value.
     */
    public static void print2DArray(int[][] array){
        for (int i=0 ;i<array.length;i++){
            for (int j=0; j<array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
