package chap5.ex5_13;

class Foo {
    int x;

    Foo(int a) {
        x = a;
    }

    void setX(int a) {
        x = a;
    }

    int getX() {
        return x;
    }
}

public class Main {
    public static void main(String[] args) {
        Foo f1 = new Foo(500);
        System.out.print(" 1 : " + f1.getX());
        Main obj = new Main();
        Foo f2 = obj.toObj(f1);
        System.out.print(" 2 : " + f2.getX());
    }

    Foo toObj(Foo f1) {
        Foo f2 = new Foo(100);
        System.out.print(" 3 : " + f1.getX());
        return f2;
    }
}
