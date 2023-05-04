package chap1.p021;

class Foo {
    void print() {
        System.out.println("package sample");
    }
}

class Main {
    public static void main(String[] args) {
        Foo f = new Foo();
        f.print();
    }
}
