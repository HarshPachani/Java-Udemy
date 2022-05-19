package com.Udemy.Module_1.BooleansAndConditionals_3;

public class N_24_WB3Point4_WeatherNetwork {
    public static void main(String[] args) {
        int temp = 25;
        String forecast;

        //IF - ELSE IF - ELSE STATEMENTS HERE!
        //if temp between -15 and -1: "The forecast is FREEZING! Stay home!"
        if(temp >=-15 && temp < 0){
            forecast = "The forecast is FREEZING! Stay home!";
        }
        //if temp between 0 and 10: "The forecast is Chilly. Wear a coat!";
        else if (temp >=0 && temp <10) {
            forecast = "The forecast is Chilly. Wear a coat!";
        }
        //else: It's warm. go outside!
        else{
            forecast = "It's warm. go outside!";
        }
        System.out.println(forecast);
    }
}
