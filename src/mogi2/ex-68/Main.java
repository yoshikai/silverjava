package mogi2.ex

class Foo {
    private void a() {
        System.out.print("X ");
    }

    public void b() {
        a();
        System.out.print("Y ");
    }
}

class Bar extends Foo {
    public void a() {
        System.out.print("Z ");
    }
}

public class Main {
    public static void main(String[] args) {
        new Bar().b();
    }
}
    
