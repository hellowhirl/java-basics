package com.hellowhirl;

import java.awt.*;
// classes automatically imported when we use them in our code
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // comparison operators
        int x = 1;
        int y = 1;
        System.out.println(x == y); // returns true
        System.out.println(x != y); // returns false
        System.out.println(x >= y); // returns true

        int temperature = 12;
        boolean isWarm = temperature > 20 && temperature < 30;
        System.out.println(isWarm); // false

        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false; // in this case we use not (!) operator to check
        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord; // to approve loan

        int temp = 2;
        if (temp > 30) {
            System.out.println("It's a hot day");
            System.out.println("Drink plenty of water");
        }
        else if (temp > 20) // works with curly braces as well
            System.out.println("Beatiful day");
        else
            System.out.println("Cold day");

        int income = 120_000;
        boolean hasGreatSalary = false; // simply declare first, and initialize with below if/else statement
        if (income > 100_000)
            hasGreatSalary = true;
        System.out.println(hasGreatSalary);

        int secondIncome = 90_000;
        boolean elegantWayToCode = (secondIncome > 100_000); // with parenthesis it's clear that this is boolean statement
        System.out.println("Elegant: " + elegantWayToCode);

        int moreIncome = 140_000;
        String className = className = moreIncome > 100_000 ? "Elite" : "Economy";
        System.out.println(className);
    }
}






