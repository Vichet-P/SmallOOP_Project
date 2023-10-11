package com.MortgageCalculateWithOOP;

public class Main {
    public static void main(String[] args) {
        int principal = (int) console.readNumber("Principal: ", 1_000, 1_000_000);
        float annualIR = (float) console.readNumber("Annual Interest Rate: ",1,30);
        byte years = (byte) console.readNumber("Period (Years): ",1,30);
        var calculator = new MortgageCalculator(principal,annualIR,years);
        var report = new MortgageReport(calculator);

        report.printMortgage();
        report.printPaymentsSchedule();

    }

}
