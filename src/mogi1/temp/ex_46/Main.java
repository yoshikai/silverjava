package mogi1.temp.ex_46;

class Foo {
}

public class Main {
    public static void main(String[] args) {
        mogi1.temp.ex_79.abc.Foo a = new mogi1.temp.ex_79.abc.Foo();
        mogi1.temp.ex_79.abc.Foo b = new mogi1.temp.ex_79.abc.Foo();
        mogi1.temp.ex_79.abc.Foo c = new mogi1.temp.ex_79.abc.Foo();
        a = c;
        c = b;
        b = null;
    }
}
