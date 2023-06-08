package mogi1.temp.ex_54;

class A {
    A() {
        this(10);
        System.out.print("a ");
    }

    A(int i) {
        System.out.print("b ");
    }
}

class B extends A {
    B() {
        super();
        System.out.print("c ");
    }

    B(String s) {
        this();
        System.out.print("d ");
    }
}

public class Main {
    public static void main(String[] args) {
        new B("hello");
    }
}
