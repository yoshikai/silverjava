package mogi1.ex

interface A {
    void use();
}

abstract class B /* line1 */ {
    // line2
    public void use() {
    }

    public abstract void x();
}

class C extends B implements A {
    // line3
}
