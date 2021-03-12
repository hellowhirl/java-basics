package com.hellowhirl;

public class Methods {
    public static void main(String[] args) {

    }
    // creating another method
    // public: means that this method can be called from outside of this class
    // static: a method that belongs to a class, as opposed to an object
    // return type: if integer then "int", and if it doesn't return any values then we write "void"
    public static void greetUser(String firstName, String lastName) {
        System.out.println("Hello " + firstName + " " + lastName );
    }

    // if our method returns a value
    public static String weatherGreeting(String condition) {
        return "Today is " + condition;
    }
}
