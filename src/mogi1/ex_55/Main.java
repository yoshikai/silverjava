package mogi1.ex_55;

interface A {
    void use();
}

abstract class B /* line1 */ {
    // line2
    public void use() {
    }

    public abstract void x();
}

//class C extends B implements A {    //NGのためコメントアウト
//    // line3
//}
