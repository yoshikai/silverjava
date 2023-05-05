package chap5._12;

class Test {
    static {
//        System.out.println("Test�N���X�Fstatic �C�j�V�����C�U");  //※コンパイルエラーのためコメントアウト
    }

//    Test() {
//        System.out.println("Test�N���X�F�R���X�g���N�^"); //※コンパイルエラーのためコメントアウト
//    }
}

public class Main {
    static {
//        System.out.println("Main�N���X�Fstatic �C�j�V�����C�U");  //※コンパイルエラーのためコメントアウト
    }

    public static void main(String[] args) {
//        System.out.println("Main�N���X�Fmain()���\�b�h");   //※コンパイルエラーのためコメントアウト
        Test obj = new Test();
    }
}

