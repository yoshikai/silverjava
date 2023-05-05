package mogi1.ex

public class Main {
    String d;

    String foo(String s) {
        s += "abc";
        return s;
    }

    public static void main(String[] args) {
        System.out.print(new Main().d);
    }
}
