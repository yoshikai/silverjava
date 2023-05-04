package chap6.ex6

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        foo(() -> 10);
    }

    public static void foo(Supplier<Integer> obj) {
        System.out.println(obj.get());
    }
}
