package com.hellowhirl;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // decalre constants (avoid magic numbers)

        int principal = 0; // better to initiate with some value
        float annualInterest = 0;
        byte years = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Principal ($1K - $1M): ");
            principal = scanner.nextInt(); // int is enough (long too big - 64 bits)

            if (principal > 1_000 && principal <= 1_000_000) {
                break;
            }
            System.out.println("Enter a value greater than $1000 and less than or equal to $1,000,000");
        }

        while (true) {
            System.out.print("Annual Interest Rate: ");
            annualInterest = scanner.nextFloat(); // float is sufficient because interest rate has only a few decimal points

            if (annualInterest > 0 && annualInterest <= 30)
                break;
            System.out.println("Enter a value greater than 0 and less than or equal to 30");
        }

        while (true) {
            System.out.print("Period (Years): ");
            // byte is sufficient to store the number 30 or anything smaller
            years = scanner.nextByte();

            if (years > 0 && years <= 30)
                break;
            System.out.println("Enter a value greater than 0 and less than or equal to 30");
        }

        double total = calculateMortgage(principal, annualInterest, years);

        NumberFormat currency = NumberFormat.getCurrencyInstance(java.util.Locale.US);
        String currencyResult = currency.format(total); // method part of NumberFormat

        // Principal = 100000;
        // Annual Interest Rate = 3.92;
        // Period (Years) = 30;
        // Mortgage: $472.81


        System.out.println("Mortgage: " + currencyResult);
    }

    // new method for calculating the mortgage - our return value will be a double
    // all the logic for calculting the mortgage is now in one place
    public static double calculateMortgage(
            int principal,
            float annualInterest,
            byte years) {

        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        float monthly = (annualInterest/PERCENT) / MONTHS_IN_YEAR;
        short numberOfPayments = (short) (years * MONTHS_IN_YEAR); // short is sufficient (16 bits)

        double top = monthly * (Math.pow(1 + monthly, numberOfPayments));
        double bottom = (Math.pow(1 + monthly, numberOfPayments)) - 1;
        double total = principal * (top / bottom);

        return total;
    }
}




















