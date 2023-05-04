package chap6

abstract class Super {
    int x;
    int y;

    public abstract void print();

    public void method(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class MyClass extends Super {
    public void print() {
        System.out.println("x : " + x + " y : " + y);
    }
}

public class Main {
    public static void main(String[] args) {
        // �X�[�p�[�N���X�̕ϐ��ɃT�u�N���X�̃I�u�W�F�N�g����
        Super obj = new MyClass();
        obj.method(10, 20);  // �X�[�p�[�N���X�̃��\�b�h�Ăяo��OK
        obj.print();         // �T�u�N���X�̃��\�b�h�Ăяo��OK
    }
}
