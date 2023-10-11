package com.MortgageCalculateWithOOP;

public class MortgageCalculator {
    private final static byte MONTHS_OF_THE_YEAR = 12;
    private final static byte PERCENT = 100;
    private  int principal;
    private  float annualIR;
    private  byte years;
    public MortgageCalculator(int principal, float annualIR, byte years) {
        this.principal = principal;
        this.annualIR = annualIR;
        this.years = years;
    }
    private double getBalance(short numberOfPaymentsMade) {
        float monthlyInterest = getMonthlyInterest();
        float numberOfPayment = getNumberOfPayment();
        return principal * (Math.pow(1 + monthlyInterest, numberOfPayment)
                - (Math.pow(1 + monthlyInterest, numberOfPaymentsMade)))
                / (Math.pow(1 + monthlyInterest, numberOfPayment) - 1);
    }
    public double[] getRemainingBalances(){
        var balances = new double[(int) getNumberOfPayment()];
        for (short month = 1; month <= balances.length; month++)
            balances[month - 1] = calculateMortgage(month);
        return balances;
    }

    private double calculateMortgage(short month) {
        return month;
    }

    public double calculateMortgage(){
        float monthlyInterest = getMonthlyInterest();
        short numberOfPayment = (short)getNumberOfPayment();
        return principal * (monthlyInterest * Math.pow(1+monthlyInterest, numberOfPayment))
                / (Math.pow(1+monthlyInterest, numberOfPayment) -1);
    }

    private float getNumberOfPayment() {
        return (float) (years * MONTHS_OF_THE_YEAR);
    }
    private float getMonthlyInterest() {
        return annualIR / PERCENT / MONTHS_OF_THE_YEAR;
    }
}
