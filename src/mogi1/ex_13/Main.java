package mogi1.ex_13;

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
