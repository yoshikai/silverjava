package chap6.ex6_25;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] ary = {"tokyo", "nagasaki", "mie", "nara"};
        List<String> city = Arrays.asList(ary);
        if (city.removeIf(str -> str.length() <= 3)) {
            System.out.println(city);
        }
    }
}
