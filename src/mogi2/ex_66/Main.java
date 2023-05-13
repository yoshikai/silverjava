package mogi2.ex_66;

import java.util.ArrayList;

interface A {
}

abstract class B implements A {
}

class C extends B {
}

class D extends B {
}

public class Main {
    public static void main(String[] args) {
        ArrayList<D> list = new ArrayList<>();
//        list.add(new B());  // code1       //NGのためコメントアウト
//        list.add(new C());  // code2   //NGのためコメントアウト
        list.add(new D());  // code3
    }
}
