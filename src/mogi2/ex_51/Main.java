package mogi2.ex

class A {
    void print() {
        System.out.print("A ");
    }

    void foo() {
        print();
    }
}

class B extends A {
    void print() {
        System.out.print("B ");
    }

    void bar() {
        print();
    }
}

public class Main {
    public static void main(String[] args) {
        B b = new B();
        b.foo();
        b.bar();
    }
}
