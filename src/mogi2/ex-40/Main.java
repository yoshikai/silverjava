package mogi2.ex

public class Main {
    public static void foo(String... args) {
        System.out.println("hello");
        for (String s : args) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        Main obj = null;
        obj.foo();
    }
}
