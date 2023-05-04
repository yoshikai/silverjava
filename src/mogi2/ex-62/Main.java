package mogi2.ex

class A {
    static void method() {
        System.out.println("A:method");
    }
}

class B extends A {
    static void method() {
        System.out.println("B:method");
    }
}

public class Main {
    public static void main(String[] args) {
        A obj = new B();
        obj.method();
        B obj2 = (B) obj;
        obj2.method();
    }
}
