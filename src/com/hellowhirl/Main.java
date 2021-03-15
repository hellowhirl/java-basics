package com.hellowhirl;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        // TextBox textBox1 = new TextBox();
        var textBox1 = new TextBox(); // replace with 'var', Java compiler will detect type for var based on right side
        textBox1.setText("Box 1");
        System.out.println(textBox1.text.toUpperCase(Locale.ROOT));

        var textBox2 = new TextBox();
        textBox2.setText("Box 2");
        System.out.println(textBox2.text);
    }
}



















