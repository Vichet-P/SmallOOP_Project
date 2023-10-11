package com.MortgageCalculateWithOOP;

import java.util.Scanner;

public class console {
    private static final Scanner scanner = new Scanner(System.in);
    public static double readNumber(String input){  // overload method
        return scanner.nextDouble();
    }
    public static double readNumber(String input, int min, int max) {
        double value;
        while (true) {
            System.out.print(input);
            value = scanner.nextDouble();
            if (value >= min && value <= max)
                break;
            System.out.println("Enter a value between " + min + " and " + max);
        }
        return value;
    }
}
