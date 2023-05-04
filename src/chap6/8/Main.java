package chap6

class SuperA {
    public SuperA() {
        System.out.println("SuperA()");
    }

    public SuperA(int a) {
        System.out.println("SuperA(int a)");
    }
}

class SubA extends SuperA {
    public SubA() {
        System.out.println("SubA()");
    }

    public SubA(int a) {
        super(a);
        System.out.println("SubA(int a)");
    }
}

public class Main {
    public static void main(String[] args) {
        SubA obj1 = new SubA();
        SubA obj2 = new SubA(10);
    }
}
