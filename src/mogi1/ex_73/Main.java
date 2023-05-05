package mogi1.ex

import java.io.IOException;

public class Main {
    public static void main(String[] args) { // line1
        method(); // line2
    }

    static void method() {  // line3
        throw new IOException();
    }
}
