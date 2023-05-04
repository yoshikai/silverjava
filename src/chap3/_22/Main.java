package chap3._22;

public class Main {
    public static void main(String[] args) {
        int num = 3;
        switch (num) {
            case 1:
            case 2:
                // num�l��1��2�̏ꍇ�A���s�����  //TODO 文字化け
                System.out.println("1 �܂��� 2 ");  //TODO 文字化け
                break;
            case 3:
            case 4:
                // num�l��3��4�̏ꍇ�A���s�����  //TODO 文字化け
                System.out.println("3 �܂��� 4 ");  //TODO 文字化け
                break;
            default:
                // num�l��1����4�ȊO�̏ꍇ�A���s�����  //TODO 文字化け
                System.out.println("default");  //TODO 文字化け
        }
    }
}
