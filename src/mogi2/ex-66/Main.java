package mogi2.ex

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
        list.add(new B());  // code1
        list.add(new C());  // code2
        list.add(new D());  // code3
    }
}
