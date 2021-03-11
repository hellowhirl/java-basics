package com.hellowhirl;

import java.awt.*;
// classes automatically imported when we use them in our code
import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {
        //loops - when we know ahead of time how many time we want to execute statements

        for (int i = 0; i < 5; i++)
            System.out.println("Hello World " + i);

        for (int j = 5; j >= 1; j--)
            System.out.println("Hello World " + j);

        // while loops - better when we don't know how many times we want to repeat something

        Scanner scanner = new Scanner(System.in); // better to put Scanner object outside of while loop (only need one)
        String input = "";
        while (!input.equals("quit")) {
            System.out.print("Input: ");
            input = scanner.next().toLowerCase(); // ensures that command executes regardless of case entered by user
            if (!input.equals("quit"))
                System.out.println(input); // echo back what user enters
        }

        // do while loop - gets executed at least once (use case is rare)

        do {
            // code gets executed at least once
            System.out.println("Do while loop executes at least once");
        } while (input == "will only keep going if while loop evalutes to true");

        while (true) { // always use break statement when using this while (true) approach
            System.out.print("Another Input: ");
            input = scanner.next().toLowerCase();
            if (input.equals("pass"))
                continue; // this will move control back to beginning of the loop
            if (input.equals("quit"))
                break; // terminates the loop
            System.out.println(input);
        }

        // for loop vs for each loop -

        // for loop
        String[] fruits = { "Apple", "Mango", "Orange" };

        for (int i = 0; i < fruits.length; i++)
            System.out.println(fruits[i]);

        // for each loop -used to iterate over arrays or collections
        // easier to write (no iterator, boolean, incrementer)
        // limitation 1: always forward only (with iterating)
        // limitation 2 :don't have access to the index of each item
        for (String fruit : fruits) // declare singue variable - each iteration will hold the value of 1 item in array
            System.out.println(fruit);
    }
}






