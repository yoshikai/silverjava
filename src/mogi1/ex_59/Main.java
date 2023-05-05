package mogi1.ex

public class Main {
    public void methodA() {
        System.out.println("Main::methodA()");
    }

    public static void main(String[] args) {
        mogi1.ex_79.abc.Foo f = new mogi1.ex_79.abc.Foo();
        Main m = new mogi1.ex_79.abc.Foo();
        f = m;
        m.methodA();
        f.methodA();
    }
}

class Foo extends Main {
    public void methodA() {
        System.out.println("Foo::methodA()");
    }
}