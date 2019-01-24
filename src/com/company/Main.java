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
        int day = 1;
        double weeklyAvgTempInCelsius = 0;

        Scanner temp = new Scanner(System.in);


        for (int i = 0; i < dailyAverageTemp.length; i++) {
            Temperature userTemp = new Temperature();

            System.out.println("Please enter the average temperature for day " + (i + 1) + " in Fahrenheit.");

            userTemp.setTempInFahrenheit(temp.nextDouble());

            dailyAverageTemp[i] = userTemp;

            averageTempTotals += dailyAverageTemp[i].getTempInFahrenheit();

            weeklyAvgTemp = averageTempTotals / (i + 1);

            weeklyAvgTempInCelsius = userTemp.convertToCelsius(weeklyAvgTemp);
        }

        Scanner choice = new Scanner(System.in);

        System.out.println("Would you like the averages in Fahrenheit or Celsius?  [ENTER F OR C TO MAKE A SELECTION");

        String userChoice = choice.next();

        if (userChoice.equals("F")) {
            for (Temperature temperature : dailyAverageTemp) {
                System.out.println("The temperature in Fahrenheit for day " + (day) + " is " + temperature.getTempInFahrenheit());
                day++;
            }

            System.out.println("The average temperature in Fahrenheit for the week is " + weeklyAvgTemp + ".\n");

        } else if (userChoice.equals("C")) {
            for (Temperature temperature : dailyAverageTemp) {
                System.out.println("The temperature in Celsius for day " + (day) + " is " + temperature.getTempInCelsius());
                day++;
            }

            System.out.println("The average temperature in Celsius for the week is " + weeklyAvgTempInCelsius + ".\n");
        } else {
            System.out.println("Invalid Choice. Please start program again.");
        }
    }
}
