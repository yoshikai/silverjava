package mogi1.ex;

import a.A;

public class B extends A {
    public B(int num) {
        super(num);
    }
}

class Main {
    public static void main(String[] args) {
        B obj = new B(10);
        obj.getNum();
    }
}
