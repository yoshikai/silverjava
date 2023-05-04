package chap6

class SuperA {    //  �X�[�p�[�N���X
    void methodA() {
        System.out.println("SuperA:methodA()");
    }

    static void methodB() {
        System.out.println("SuperA:methodB()");
    }
}

class SubA extends SuperA {  // �T�u�N���X
    void methodA() {
        System.out.println("SubA:methodA()");
    }

    //static void methodA() { System.out.println("SubA:methodA()"); }
    static void methodB() {
        System.out.println("SubA:methodB()");
    }
    //void methodB() { System.out.println("SubA:methodB()"); }
}

public class Main {
    public static void main(String[] args) {
        SubA obj = new SubA();
        obj.methodA();
        obj.methodB();
    }
}
