package chap6._12;

interface MyInter1 {
    double methodA(int num);

    default void methodB() {
        System.out.println("methodB()");
    }
}

interface MyInter2 {
    int methodC(int val1, int val2);

    static void methodD() {
        System.out.println("methodD()");
    }
}

class MyClass implements MyInter1, MyInter2 {
    public double methodA(int num) {
        return num * 0.3;
    }

    public int methodC(int val1, int val2) {
        return val1 + val2;
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        System.out.println("methodA()" + obj.methodA(10));
        System.out.println("methodC()" + obj.methodC(10, 20));
        obj.methodB();      // �f�t�H���g���\�b�h�̌Ăяo��
        MyInter2.methodD(); // static���\�b�h�̌Ăяo��

    }
}
