package mogi1.ex

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        int i = 25;
        Supplier<Integer> s = () -> i;
        i++;
        System.out.println(s.get());
    }
}
