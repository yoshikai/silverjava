package chap5

class Test {
    static {
        System.out.println("Test�N���X�Fstatic �C�j�V�����C�U");
    }

    Test() {
        System.out.println("Test�N���X�F�R���X�g���N�^");
    }
}

public class Main {
    static {
        System.out.println("Main�N���X�Fstatic �C�j�V�����C�U");
    }

    public static void main(String[] args) {
        System.out.println("Main�N���X�Fmain()���\�b�h");
        Test obj = new Test();
    }
}

