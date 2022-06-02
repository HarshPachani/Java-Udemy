package com.Udemy.Module_1.Arrays_6;

import java.util.Arrays;

public class N_11_UpdatingArrays {
    public static void main(String[] args) {
        String[] menu = {"Espresso","Iced Coffee","Macchiato"};
        menu[2] = "Latte";  //Updated Array value.
        System.out.println(Arrays.toString(menu));  //To print the array elements directly using inbuilt java function.

        String[] newMenu = new String[5];
        for (int i=0;i< menu.length; i++){
            newMenu[i] = menu[i];   //To copy the one array into the second.
        }
        newMenu[3] = "House Blend";
        newMenu[4] = "Dark Roast";
        System.out.println(Arrays.toString(newMenu));
    }
}
