package chap3._23;

public class Main {
    public static void main(String[] args) {
        int num = 0;
        int a = 10;
        final int b = 20;
        switch (num) {
//            case a:   // �R���p�C���G���[   //NG     //TODO 文字化け
//                System.out.println("case a :�̎��s");  //TODO 文字化け
            case b:
                System.out.println("case b :�̎��s");  //TODO 文字化け
            case 30:
                System.out.println("case c :�̎��s");  //TODO 文字化け
        }

        String s1 = "A";
        final String s2 = "B";
        final String[] s3 = {"C"};
        switch ("X") {
//            case s1:  // �R���p�C���G���[  //TODO 文字化け
//                System.out.println("case s1   :�̎��s");  //TODO 文字化け
            case s2:
                System.out.println("case s2   :�̎��s");  //TODO 文字化け
//            case s3[0]:  // �R���p�C���G���[      //TODO 文字化け
                System.out.println("case s3[0]:�̎��s");  //TODO 文字化け
        }
    }
}
