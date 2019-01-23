package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*Create a new project in IntelliJ IDEA named ArrayPractice.

        Initialize your project as a Git repository and be sure to add and commit all changes as you work.

        Declare an array named dailyAverageTemp.

        Instruct the user to input daily average temperatures (in degrees Fahrenheit) for 7 days.

        Each time the user inputs a value, add it to your dailyAverageTemp array*/

        double[] dailyAverageTemp = new double[7];
        double weeklyAvgTemp = 0;
        double averageTempTotals = 0;
        double[] dailyAverageTempCelsius = new double [7];
        int day = 0;
        double averageTempTotalsInCelsius = 0;
        double weeklyAvgTempInCelsius = 0;

        Scanner temp = new Scanner(System.in);

        for (int i = 0; i < dailyAverageTemp.length; i++){
            System.out.println("Please enter the average temperature for day " + (i+1) + ".");

            dailyAverageTemp[i] = temp.nextDouble();

            averageTempTotals+=dailyAverageTemp[i];

            weeklyAvgTemp = averageTempTotals/(i+1);

            /*System.out.println("The average temperature you entered for day " + (i+1) + " is " + dailyAverageTemp[i] +
                    "\nThe running daily average temperature for the week is " + weeklyAvgTemp + ".\n\n");*/
        }

        //(Fahrenheit - 32) / 1.8 = Celsius

        for(double temperature: dailyAverageTemp){

            dailyAverageTempCelsius[day] = (temperature - 32) / 1.8;

            averageTempTotalsInCelsius+=dailyAverageTempCelsius[day];

            weeklyAvgTempInCelsius = averageTempTotalsInCelsius/(day+1);

            System.out.println("On day " + (day+1) + " the temperature in Fahrenheit is " + temperature + " and the temperature in Celsius is " + dailyAverageTempCelsius[day]);
            day++;
        }

        System.out.println("\nThe average temperature for the week in Fahrenheit is " + weeklyAvgTemp);
        System.out.println("The average temperature for the week in Celsius is " + weeklyAvgTempInCelsius + ".");
    }
}
