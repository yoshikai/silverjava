package chap3._21;

public class Main {
    public static void main(String[] args) {
        int num = 2;
        switch (num) {
            case 1:    // num�̒l��1�̏ꍇ�̏���   //TODO 文字化け
                System.out.println("num�̒l��1�ł��B");  //TODO 文字化け
                break;   // break�ɂ��switch���甲����  //TODO 文字化け
            case 2:    // num�̒l��2�̏ꍇ�̏���  //TODO 文字化け
                System.out.println("num�̒l��2�ł��B");  //TODO 文字化け
                // break�����Ȃ����߁A����default�̏����������s  //TODO 文字化け
            default:   // num�̒l��1�ȊO�̏ꍇ�̈ȉ������s�����  //TODO 文字化け
                System.out.println("default�ł��B");  //TODO 文字化け
        }
    }
}
