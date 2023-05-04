package mogi1.ex

class Foo {
}

public class Main {
    public static void main(String[] args) {
        Foo a = new Foo();
        Foo b = new Foo();
        Foo c = new Foo();
        a = c;
        c = b;
        b = null;
    }
}
