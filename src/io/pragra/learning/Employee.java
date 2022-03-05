package io.pragra.learning;

public class Employee {
    private int empId;
    private String name;

    public double calWages(double hourlyRate, int hoursWorked) {
        return hourlyRate*hoursWorked;
    }

    public double calWages(double hourlyRate, int hoursWorked, double bonus) {
        return calWages(hourlyRate,hoursWorked)+bonus;
    }

    public double calWages(double hourlyRate, int hoursWorked, int overTime) {
        return calWages(hourlyRate,hoursWorked)+1.25*hourlyRate*overTime;
    }

    public double calWages(double hourlyRate, int hoursWorked, int overTime, double bonus) {
        return calWages(hourlyRate,hoursWorked, bonus)+1.25*hourlyRate*overTime;
    }


}
