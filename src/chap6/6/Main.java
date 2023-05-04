package chap6

class SuperA {
    int num;

    public void methodA() {
        num += 100;
    }

    public void print() {
        System.out.println("num�l :" + num);
    }
}

class SubA extends SuperA {
    public void methodA() {
        num += 500;
    }

    public void methodB() {
        methodA();        // 7�s�ڂ��Ăяo�����
        print(); // �X�[�p�[�N���X�̃��\�b�h�Ăяo��
        super.methodA();  // 3�s�ڂ��Ăяo�����
        print(); // �X�[�p�[�N���X�̃��\�b�h�Ăяo��
    }
}

public class Main {
    public static void main(String[] args) {
        SubA obj = new SubA();
        obj.methodB();
    }
}
