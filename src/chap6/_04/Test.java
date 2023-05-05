package chap6._04;

class SuperA {
}                        // �X�[�p�[�N���XA

final class SuperB {
}                  // �X�[�p�[�N���XB

class SuperC {
    void print() {
    }
}        // �X�[�p�[�N���XC

class SuperD {
    final void print() {
    }
}  // �X�[�p�[�N���XD

class SubA extends SuperA {
}                   // �T�u�N���XA // OK

//class SubB extends SuperB { }                 // �T�u�N���XB // NG
class SubC extends SuperC {
    void print() {
    }
}   // �T�u�N���XC // OK
//class SubD extends SuperD { void print(){ } } // �T�u�N���XD // NG
