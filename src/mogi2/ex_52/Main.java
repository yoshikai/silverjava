package mogi2.ex_52;

class A {
}

class B extends A {
}

public class Main {
    public static void main(String[] args) {
        A[] ary = new B[2];
//        A[] ary = new A[2]; //NGのためコメントアウト
//        A[] ary = new Object[2];
//        A[] ary = new A();
//        A[] ary = new B();

    }
}