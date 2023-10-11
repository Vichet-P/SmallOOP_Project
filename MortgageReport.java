package com.MortgageCalculateWithOOP;

import java.text.NumberFormat;

public class MortgageReport {
    private final NumberFormat currency;
    private  MortgageCalculator mortgageCalculator;

    public MortgageReport(MortgageCalculator mortgageCalculator) {
        this.mortgageCalculator = mortgageCalculator;
        currency = NumberFormat.getCurrencyInstance();
    }
    public void printPaymentsSchedule() {
        System.out.println("Payment Schedules : ");
        for (double balance : mortgageCalculator.getRemainingBalances())
            System.out.println(currency.format(balance));
        }
    public void printMortgage() {
        double mortgage = mortgageCalculator.calculateMortgage();
        String mortgageFormatted = currency.format(mortgage);
        System.out.println("\nMortgage : ");
        System.out.println("_______");
        System.out.println("Monthly Payments: " + mortgageFormatted);
        System.out.println("\nMortgage: \n_______");
        printPaymentsSchedule();
    }
}
