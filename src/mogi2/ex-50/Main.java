package mogi2.ex

class A {
    void x() {
        System.out.print("A ");
    }
}

class B extends A {
    void x() {
        System.out.print("B ");
    }
}

public class Main {
    public static void main(String[] args) {
        B b = new B();
        A a = new B();
        a = b;
        a.x();
        b.x();
    }
}
