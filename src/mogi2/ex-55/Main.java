package mogi2.ex

class A {
    final int num;

    A(int num) {
        this.num = num;
    }

    A() {
        this.num = 0;
    }

    final void method() {
        System.out.print("A:method");
    }
}

class B extends A {
    int num = 10;

    void method() {
        System.out.print("B:method");
    }
}

public class Main {
    public static void main(String[] args) {
        A a = new B();
        a.method();
    }
}
