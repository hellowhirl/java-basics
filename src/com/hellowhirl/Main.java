package com.hellowhirl;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // decalre constants (avoid magic numbers)
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);
        int principal;
        while (true) {
            System.out.print("Principal ($1K - $1M): ");
            principal = scanner.nextInt(); // int is enough (long too big - 64 bits)

            if (principal < 1_000 || principal > 1_000_000) {
                System.out.println("Enter a value greater than $1000 and less than or equal to $1,000,000");
            }
            else break;
        }

        float annualInterest;
        while (true) {
            System.out.print("Annual Interest Rate: ");
            annualInterest = scanner.nextFloat(); // float is sufficient because interest rate has only a few decimal points

            if (annualInterest <= 0 || annualInterest > 30) {
                System.out.println("Enter a value greater than 0 and less than or equal to 30");
                continue;
            }
            else break;
        }
        float monthly = (annualInterest/PERCENT) / MONTHS_IN_YEAR;

        byte years; // byte is sufficient to store the number 30 or anything smaller
        while (true) {
            System.out.print("Period (Years): ");
            years = scanner.nextByte();

            if (years <= 0 || years > 30) {
                System.out.println("Enter a value greater than 0 and less than or equal to 30");
            }
            else break;
        }

        int numberOfPayments = years * MONTHS_IN_YEAR; // int is sufficient (32 bits)
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
