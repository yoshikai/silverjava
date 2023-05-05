package mogi2.ex

public class Main {
    public static void foo(String... args) {
        System.out.println("hello");
        for (String s : args) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        mogi2.ex_78.my.exam.Main obj = null;
        obj.foo();
    }
}
