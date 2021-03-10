package com.hellowhirl;

import java.awt.*;
// classes automatically imported when we use them in our code
import java.util.Scanner;

public class Main {

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
            System.out.println(input); // echo back what user enters
        }

        // do while loop - gets executed at least once (use case is rare)

        do {
            // code gets executed at least once
            System.out.println("Do while loop");
        } while (input == "will only continue if while loop evalutes to true");
    }
}






