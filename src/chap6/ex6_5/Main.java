package chap6.ex6_5;

interface A {
}

class B implements A {
}

class C extends B {
}

class D {
}

public class Main {
    public static void main(String[] args) {
        A obj1 = new B();
        B obj2 = new C();
        D obj3 = new D();
        if (obj1 instanceof A) {
            System.out.print("obj1 ");
        }
        if (obj2 instanceof A) {
            System.out.print("obj2 ");
        }
        if (obj3 instanceof A) {
            System.out.print("obj3 ");
        }
    }
}