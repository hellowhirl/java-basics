package com.hellowhirl;

import java.awt.*;
// classes automatically imported when we use them in our code
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    // main method of program should always be "static"
    public static void main(String[] args) {
        byte temperature = 15;
        byte myAge = 15;
        byte herAge = myAge;

        int viewsCount = 123_456_789;
        long moreViewsCount = 3_123_456_789L;
        double decimalPointPrice = 4.99;
        float price = 10.99F;
        char letter = 'A';
        boolean isEligible = true;
	    System.out.println(herAge);

	    byte anotherAge = 30;
        Date now = new Date();
        System.out.println(now);

        byte x = 1;
        byte y = x;
        x = 2;
        System.out.println(y);
        System.out.println(x);

        // Point object comes with Fields - predefined variables (x and y)
        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);

        String message = "   Hello World" + "!!  ";
        System.out.println(message);
        System.out.println(message.endsWith("!!"));
        System.out.println(message.replace( "!",  "*"));
        System.out.println(message);
        System.out.println(message.trim());

        String reply = "Guten \"Morgen\"";
        System.out.println(reply);

        String drive = "Location:\nC:\\Windows\\\\...";
        String tabs = "Insert\tTab";
        System.out.println(drive);
        System.out.println(tabs);

        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        System.out.println(Arrays.toString(numbers)); // all undefined items are 0 by default
        // if it was a boolean array, all items will get initiated to false by default
        // if it was a string array, all items will get initiated to an empty string by default

        int[] shinNumbers = {2, 3, 5, 1, 4};
        System.out.println(numbers.length); // in Java arrays have a fixed length
        Arrays.sort(shinNumbers);
        System.out.println(Arrays.toString(shinNumbers));

        // Two-dimensional array
        int[][] multi = new int[2][3];
        multi[0][0] = 1;
        System.out.println(Arrays.deepToString(multi));

        // more straight forward approach
        int[][] anotherMulti = { {1, 2, 3}, {4, 5, 6} };
        System.out.println(Arrays.deepToString(anotherMulti));

        // constant (final) variables - in ALL CAPS
        final float PI = 3.14F;
        System.out.println(PI);

        int addition = 10 + 3;
        System.out.println(addition);

        double division = (double)10 / (double)3;
        System.out.println(division);

        int d = 1;
        int e = d++; // ++ appended: here d will get copied to e (1) and then d will get incremented by 1 (to 2)
        System.out.println(d + " and " + e);

        int f = 2;
        int g = ++f; // ++ prefixed: both values will become 3
        System.out.println(f + " and " + g);

        // augmented assignment operators
        int h = 3;
        h += 4;
        System.out.println(h);

        // implicit castig (automatic type conversion)
        // byte > short > int > long > double
        // this happens whenever we are not going to lose data
        short i = 1; // short: 2 bytes
        int j  = i + 2; // int: 4 bytes
        System.out.println(j);

        // in a double we can have digits after the decimal point
        double k = 4.1;
        double l = k + 5; // integer 5 is casted to a double (5.0)
        System.out.println(l);

        // explicit casting: when we want to specify a result's data type
        double m = 2.3;
        int n = (int) m + 4;
        System.out.println(n);

        // implicit casting only happens between compatible types (not between numbers and String

        // in most user input we get values as a String
        String userInput = "1.1";
        double convertedString = Double.parseDouble(userInput);
//        int convertedStringOther = Integer.parseInt((userInput);
        convertedString += 6;
        System.out.println(convertedString);

        int intResult = Math.round(1.1F); // this method, like others, is overloaded
        System.out.println(intResult);

        int ceilResult = (int)Math.ceil(2.4F);
        System.out.println(ceilResult);

        int floorResult = (int)Math.floor(4.1F);
        System.out.println(floorResult);

        int maxResult = Math.max(1, 2); // as well as Math.min
        System.out.println(maxResult);

        double randomResult = Math.random(); // this returns a double between 0 to 1
        System.out.println(randomResult);

        int roundedResult = (int)(Math.random() * 100);
        System.out.println(roundedResult);

        // we cannot create a new instance of NumberFormat class because it's abstract
        // instead we use below factory function:
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String currencyResult = currency.format(1234567.891);
        System.out.println(currencyResult);

        // method chaining
        String percentResult = NumberFormat.getPercentInstance().format(0.2);
        System.out.println(percentResult);

        // reading input
        Scanner scanner = new Scanner(System.in); // in is a Field in the System class
        System.out.print("Age: "); // for a floating point number we need to call nextFloat() or nextDouble()
        byte age = scanner.nextByte(); // will output what we input in terminal
        System.out.println("You are " + age + " years old");

        System.out.print("Favorite word: ");
        String name = scanner.next(); // we use next() for string
        System.out.println("Your favorite word is " + name);

        Scanner newScanner = new Scanner(System.in);
        System.out.print("Full name: ");
        String fullName = newScanner.nextLine().trim(); // we will get two tokens so we use nextLine()
        System.out.println("Your full name is " + fullName);
    }
}






