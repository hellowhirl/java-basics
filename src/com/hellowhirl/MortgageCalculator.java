package com.hellowhirl;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        // decalre constants (avoid magic numbers)
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        int principal = scanner.nextInt(); // int is enough (long too big - 64 bits)

        System.out.print("Annual Interest Rate: ");
        float annualInterest = scanner.nextFloat(); // float is sufficient because interest rate has only a few decimal points
        float monthly = (annualInterest/PERCENT) / MONTHS_IN_YEAR;

        System.out.print("Period (Years): ");
        byte y = scanner.nextByte(); // byte is sufficient to store the number 30 or anything smaller
        int numberOfPayments = y * MONTHS_IN_YEAR; // int is sufficient (32 bits)

        double top = monthly * (Math.pow(1 + monthly, numberOfPayments));
        double bottom = (Math.pow(1 + monthly, numberOfPayments)) - 1;
        double total = principal * (top / bottom);

        NumberFormat currency = NumberFormat.getCurrencyInstance(java.util.Locale.US);
        String currencyResult = currency.format(total); // method part of NumberFormat

        // Principal = 100000;
        // Annual Interest Rate = 3.92;
        // Period (Years) = 30;
        // Mortgage: $472.81


        System.out.println("Mortgage: " + currencyResult);
    }
}
