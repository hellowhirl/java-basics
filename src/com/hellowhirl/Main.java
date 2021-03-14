package com.hellowhirl;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    // decalre constants (avoid magic numbers)
    // constants moved to top of our main class, add static because static methods can only access static variables
    final static byte MONTHS_IN_YEAR = 12; // these are called 'fields' because we define these variables at class level
    final static byte PERCENT = 100; // these fields are accessible to all methods in this class

    public static void main(String[] args) {
        // this returns a double so we cast it to an integer and then store result in 'prinncipal'
        int principal = (int) readNumber("Principal ($1K - $1M): ", 1_000, 1_000_000);
        float annualInterest = (float) readNumber("Annual Interest Rate: ", 0, 30);
        byte years = (byte) readNumber("Period (Years): ", 0, 30);

        printMortgage(principal, annualInterest, years);
        // add breaks in code to separate parts in organized manner
        printPaymentSchedule(principal, annualInterest, years);
    }

    private static void printMortgage(int principal, float annualInterest, byte years) {
        double total = calculateMortgage(principal, annualInterest, years);
        String convertedBalance = convertToCurrency(total);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + convertedBalance);
    }

    private static void printPaymentSchedule(int principal, float annualInterest, byte years) {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        System.out.println(calculateRemainingBalance(principal, annualInterest, years));
    }

    public static double readNumber(String prompt, double min, double max) {
        Scanner scanner = new Scanner(System.in);
        double value; // we want to work with a generic variable - all we care about is reading a value
        while (true) {
            System.out.print(prompt);
            value = scanner.nextFloat(); // float is sufficient because interest rate has only a few decimal points

            if (value > min && value <= max)
                break;
            System.out.println("Enter a value greater than " + min + " and less than or equal to " + max);
        }
        return value; // finally, we return the value after it is properly validated
    }

    // new method for calculating the mortgage - our return value will be a double
    // all the logic for calculting the mortgage is now in one place
    public static double calculateMortgage(
            int principal,
            float annualInterest,
            byte years) {

        // duplication tradeoff here OK: because formula for making these calculations never changes
        float monthly = (annualInterest / PERCENT) / MONTHS_IN_YEAR;
        float numberOfPayments = years * MONTHS_IN_YEAR; // short is sufficient (16 bits)

        double top = monthly * (Math.pow(1 + monthly, numberOfPayments));
        double bottom = (Math.pow(1 + monthly, numberOfPayments)) - 1;
        return principal * (top / bottom);
    }

    public static String convertToCurrency(double value) {
        NumberFormat currency = NumberFormat.getCurrencyInstance(java.util.Locale.US);

        return currency.format(value); // method part of NumberFormat
    }

    public static String calculateRemainingBalance(
            int principal,
            float annualInterest,
            byte years
    ) {
        // decalre constants (avoid magic numbers)

        float monthly = (annualInterest / PERCENT) / MONTHS_IN_YEAR;
        float numberOfPayments = years * MONTHS_IN_YEAR; // short is sufficient (16 bits)

        short paymentsMade = 1;
        while (paymentsMade < numberOfPayments) {
            double equationTop = Math.pow(1 + monthly, numberOfPayments) - Math.pow(1 + monthly, paymentsMade);
            double equationBottom = Math.pow(1 + monthly, numberOfPayments) - 1;
            double balance = principal * (equationTop / equationBottom);
            paymentsMade++;

//            NumberFormat currency = NumberFormat.getCurrencyInstance(java.util.Locale.US);
//            String currencyResult = currency.format(balance); // method part of NumberFormat
//            System.out.println(currencyResult);
            String convertedBalance = convertToCurrency(balance);
            System.out.println(convertedBalance);
        }
        String finalValue = "$0.00";
        return finalValue;
    }
}



















