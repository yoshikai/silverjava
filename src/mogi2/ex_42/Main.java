package mogi2.ex

interface A {
    void exe();
}

abstract class B implements A {
    public abstract void exe();
}

class C implements B {
    public void exe() {
    }
}
