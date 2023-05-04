package mogi2.ex

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("2", "4", "6");
        list.forEach(x -> System.out.print(x + " "));
    }
}
