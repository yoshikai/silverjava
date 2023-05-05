package mogi1.ex

class A {
    A() {
        System.out.print("A ");
    }
}

class B extends A {
    B() {
        System.out.print("B ");
    }
}

class C extends B {
    C() {
        System.out.print("C ");
    }
}

public class Main {
    public static void main(String[] args) {
        A obj = new C();
    }
}
