package chap6

class SuperA {    // �X�[�p�[�N���X
    public void print(String s) {
        System.out.println("SuperA print : " + s);
    }

    public void method() {
    }
}

class SubA extends SuperA {  // �T�u�N���X
    public void print(String s) {
        s = "�n���ꂽ������� " + s + " �ł�";
        System.out.println("SubA print   : " + s);
    }
    //void method() { } // �R���p�C���G���[
}

public class Main {
    public static void main(String[] args) {
        SuperA obj1 = new SuperA();
        obj1.print("Java");    // 2�s�ڂ��Ăяo�����
        SubA obj2 = new SubA();
        obj2.print("Java");    // 8�s�ڂ��Ăяo�����
    }
}
