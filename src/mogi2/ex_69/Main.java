package mogi2.ex

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<String, Integer> obj = str -> Integer.parseInt(str) / 1000;
        System.out.println(obj.apply("100"));
    }
}
