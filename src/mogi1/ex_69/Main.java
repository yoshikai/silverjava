package mogi1.ex_69;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
//        try { //NGのためコメントアウト
//            method();
//        }
        //[  1  ]
    }

    static void method() throws IllegalArgumentException, IOException {
        if (false) {
            throw new FileNotFoundException();
        } else {
            throw new IllegalArgumentException();
        }
    }
}
