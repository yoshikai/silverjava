package chap4._09;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; ; i++) { //��2���ȗ�����Ă���̂Ŗ������[�v
            if (i == 3) {
                break;    // break�ɂ��for�����甲����
            }
            System.out.println("i = " + i);
        }
        System.out.println("for���̌�̏���");
    }
}
