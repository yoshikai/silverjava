package mogi1.ex

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            method();
        } [   �@   ]
    }

    static void method() throws IllegalArgumentException, IOException {
        if (false) {
            throw new FileNotFoundException();
        } else {
            throw new IllegalArgumentException();
        }
    }
}
