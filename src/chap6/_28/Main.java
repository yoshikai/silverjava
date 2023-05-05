package chap6._28;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<String, String> obj = str -> "Hello " + str;
        String str = obj.apply("tanaka");
        System.out.println(str);
    }
}