package mogi2.ex

interface A {
    public void a();
}

abstract class B implements A {
    abstract void b();
}

abstract class C extends A {
    public void a() {
    }
}

class D extends C {
    public void b() {
    }
}
