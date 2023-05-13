package mogi2.ex_41;

class A {
    private boolean check() {
        return true;
    }
}

class B extends A {
    void foo() {
//        if (check()) {  //NGのためコメントアウト
//            System.out.println("Java");
//        }
    }
}

public class Main {
    public static void main(String[] args) {
        B obj = new B();
        obj.foo();
    }
}
