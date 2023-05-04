package mogi2.ex

class A {
    private boolean check() {
        return true;
    }
}

class B extends A {
    void foo() {
        if (check()) {
            System.out.println("Java");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        B obj = new B();
        obj.foo();
    }
}
