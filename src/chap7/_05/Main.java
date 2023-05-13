package chap7._05;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        // 例外処理は任意
        int i = Integer.parseInt("10");

        // 例外処理は必須
        //new FileReader("Test.txt");
//        try {
//            FileReader r = new FileReader("Test.txt");
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
    }
}
