package mogi1.ex

class A {
    private void print() {
        System.out.print("A ");
    }

    public void b() {
        print();
    }
}

class B extends A {
    void print() {
        System.out.print("B ");
    }

    public void b() {
        print();
    }
}

class C extends B {
    void print() {
        System.out.print("C ");
    }
}

public class Main {
    public static void main(String[] args) {
        new A().b();
        new B().b();
        new C().b();
    }
}
