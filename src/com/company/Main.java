package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*Create a new project in IntelliJ IDEA named ArrayPractice.

        Initialize your project as a Git repository and be sure to add and commit all changes as you work.

        Declare an array named dailyAverageTemp.

        Instruct the user to input daily average temperatures (in degrees Fahrenheit) for 7 days.

        Each time the user inputs a value, add it to your dailyAverageTemp array*/

        Temperature[] dailyAverageTemp = new Temperature[7];
        double weeklyAvgTemp = 0;
        double averageTempTotals = 0;
        double[] dailyAverageTempCelsius = new double [7];
        int day = 1;
        double averageTempTotalsInCelsius = 0;
        double weeklyAvgTempInCelsius = 0;

        Scanner temp = new Scanner(System.in);


        for (int i = 0; i < dailyAverageTemp.length; i++) {
            Temperature userTemp = new Temperature();

            System.out.println("Please enter the average temperature for day " + (i+1) + " in Fahrenheit.");

            userTemp.setTempInFahrenheit(temp.nextDouble());

            dailyAverageTemp[i] = userTemp;

            averageTempTotals+=dailyAverageTemp[i].getTempInFahrenheit();

            weeklyAvgTemp = averageTempTotals/(i+1);

        }

        for(Temperature temperature: dailyAverageTemp) {
            System.out.println("The temperature in Fahrenheit for day " + (day) + " is " + temperature.getTempInFahrenheit());
            System.out.println("The temperature in Celsius for day " + (day) + " is " + temperature.getTempInCelsius() + "\n");
            day++;
        }

        System.out.println("\nThe average temperature in Fahrenheit for the week is " + weeklyAvgTemp + "\n");

    }

}
