package chap6.p276;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<String, String> obj = (String str) -> {
            return "Hello " + str;
        };
        String str = obj.apply("tanaka");
        System.out.println(str);
    }
}