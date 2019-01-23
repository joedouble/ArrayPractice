package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*Create a new project in IntelliJ IDEA named ArrayPractice.

        Initialize your project as a Git repository and be sure to add and commit all changes as you work.

        Declare an array named dailyAverageTemp.

        Instruct the user to input daily average temperatures (in degrees Fahrenheit) for 7 days.

        Each time the user inputs a value, add it to your dailyAverageTemp array*/

        double userTemp = 0;
        double[] dailyAverageTemp = new double[7];

        Scanner temp = new Scanner(System.in);

        System.out.println("Please enter the temperature for the day");

        for (int i = 0; i < dailyAverageTemp.length; i++){
            dailyAverageTemp[i] = temp.nextDouble();
            System.out.println("The counter is at" + counter + "\nThe daily average temperature for the day entered is: " + dailyAverageTemp[i]);
        }

    }
}
