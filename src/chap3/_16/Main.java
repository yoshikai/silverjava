package chap3._16;

public class Main {
    public static void main(String[] args) {
        int num = 5;
        if (num < 10) {
            System.out.println("num�̒l��10�����ł��B");  //TODO 文字化け
        }
        num = 20;
        if (num >= 100)
            System.out.println("num�̒l��100�ȏ�ł��B");  //TODO 文字化け
        System.out.println("2�߂�if���̌�̏���");  //TODO 文字化け
    }
}
