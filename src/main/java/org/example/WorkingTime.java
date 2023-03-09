package org.example;

public class WorkingTime {

    double hours;
    double overHours;

    public WorkingTime(double hours, double overHours) {
        this.hours = hours;
        this.overHours = overHours;
    }

    @Override
    public String toString() {
        return hours + " + " + overHours;
    }

}
