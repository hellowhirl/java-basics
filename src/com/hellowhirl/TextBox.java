package com.hellowhirl;

public class TextBox {
    // Field - uses cameCasing
    public String text = ""; // if we initialize to empty string we eliminate this field being referenced as null

    public void setText(String text) {
        // text = text; // in the cae where parameter is same name as field, we can use 'this' ketword
        this.text = text;
    }

    public void clearText() {
        text = ""; //
    }
}
