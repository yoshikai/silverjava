package mogi2.ex

import java.io.IOException;

public class Main {
    public static void main(String[] args) { // code1
        Main obj = new Main();
        obj.method();  // code2
    }

    void method() throws IOException {
    } // code3
}
