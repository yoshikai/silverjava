package mogi2.ex

class A {
    A() {
        this(10);
        System.out.print(1 + " ");
    }

    A(int i) {
        System.out.print(2 + " ");
    }
}

class B extends A {
    B() {
        super();
        System.out.print(3 + " ");
    }

    B(String s) {
        super();
        System.out.print(4 + " ");
    }
}

public class Main {
    public static void main(String[] args) {
        new B("A");
    }
}