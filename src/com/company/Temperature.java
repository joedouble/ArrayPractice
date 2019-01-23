package com.company;

public class Temperature {

    private double tempInFahrenheit;
    private double tempInCelsius;

    public void setTempInFahrenheit(double temperatureFahrenheit) {
        tempInFahrenheit = temperatureFahrenheit;
    }

    public double getTempInFahrenheit() {
        return tempInFahrenheit;
    }

    public double convertToCelsius(double tempInFahrenheit) {
        return (tempInFahrenheit - 32) / 1.8;
    }

    public double getTempInCelsius(){
        tempInCelsius = convertToCelsius(tempInFahrenheit);
        return tempInCelsius;
    }
}
