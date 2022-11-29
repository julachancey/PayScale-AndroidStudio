package com.example.dig4634_final;

import org.parceler.Parcel;

@Parcel
public class State {
    public String name;
    public double stateTax;
    public double incomeTax;
    public double costOfLivingIndex;
    public double housingIndex;
    public double groceriesIndex;
    public double utilitiesIndex;
    public double transportationIndex;
    public double healthIndex;
    public double miscellaneousIndex;
    public int averageSalary;

    public State() {}

    public State(String name, double stateTax, double costOfLivingIndex, double housingIndex,
                 double groceriesIndex, double utilitiesIndex, double transportationIndex,
                 double healthIndex, double miscellaneousIndex, int averageSalary) {
        this.name = name;
        this.stateTax = stateTax;
        this.incomeTax = incomeTax;
        this.costOfLivingIndex = costOfLivingIndex;
        this.housingIndex = housingIndex;
        this.groceriesIndex = groceriesIndex;
        this.utilitiesIndex = utilitiesIndex;
        this.transportationIndex = transportationIndex;
        this.healthIndex = healthIndex;
        this.miscellaneousIndex = miscellaneousIndex;
        this.averageSalary = averageSalary;
    }

}
