package chap6.ex6_4;

interface A { void x(int num);}
abstract class B {
    public void x(int num) {}
    public abstract void y();
}
class C extends B implements A {
    public void y() {}
}  
