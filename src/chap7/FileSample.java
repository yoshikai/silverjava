package chap7;

import java.io.FileInputStream;
import java.io.File;
import java.io.FileNotFoundException;

public class FileSample {

    public static void main(String[] args){
//        File f = new File("sample");
//        try {
//            FileInputStream fis = new FileInputStream(f);

            int i = Integer.parseInt(args[0]);
            System.out.println("入力された数字は" + i);
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
    }
}
