package mogi1.temp.ex_59;

public class Main {
    public void methodA() {
        System.out.println("Main::methodA()");
    }

    public static void main(String[] args) {
        Foo f = new Foo();
        Main m = new Foo();
//        f = m;  //NGのためコメントアウト
        m.methodA();
        f.methodA();
    }
}

class Foo extends Main {
    public void methodA() {
        System.out.println("Foo::methodA()");
    }
}