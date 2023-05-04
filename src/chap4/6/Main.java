package chap4

public class Main {
    public static void main(String[] args) {
        int count1 = 0;
        for (; count1 < 5; count1++) {  // ��1���ȗ�������
            System.out.print(count1 + " ");
        }
        System.out.println();  //���s
        for (int count2 = 0; count2 < 5; ) { // ��3���ȗ�������
            System.out.print(count2++ + " "); // ���������ŃJ�E���^�ϐ��̍X�V
        }
    }
}
