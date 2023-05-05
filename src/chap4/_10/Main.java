package chap4._10;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            if ((i % 3) == 0) {
                System.out.println("�������X�L�b�v���܂�");
                continue;    // continue�ɂ��for���̎�3�֐�����ڂ�
            }
            System.out.println("i = " + i);
        }
        System.out.println("for���̌�̏���");
    }
}