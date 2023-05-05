package mogi2.ex

class A {
}

class B extends A {
}

public class Main {
    public static void main(String[] args) {
        A[] ary = new B[2];
        A[] ary = new A[2];
        A[] ary = new Object[2];
        A[] ary = new A();
        A[] ary = new B();

    }
}