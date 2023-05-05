package chap6.ex6_2;

class A {
}

class B extends A {
}

public class Main {
    public static void main(String[] args) {
        A[] ary = new A[2];
        ary[0] = new A();
        ary[1] = new B();
    }
}