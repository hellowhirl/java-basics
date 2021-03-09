package com.hellowhirl;

import java.awt.*;
// classes automatically imported when we use them in our code
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String message = "";

        System.out.print("Number: ");

        Scanner scanner = new Scanner(System.in);
        int userNumberInput = scanner.nextInt();

        // should have the most specific conditions on the top, and most generic on the bottom
        if ((userNumberInput % 3 == 0) && (userNumberInput % 5 == 0))
            message = "fizz buzz";
        else if (userNumberInput % 3 == 0)
            message = "fizz";
        else if (userNumberInput % 5 == 0)
            message = "buzz";
        else
            message = String.valueOf(userNumberInput);

        System.out.println(message);
    }
}






