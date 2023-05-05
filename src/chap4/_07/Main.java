package chap4._07;

public class Main {
    public static void main(String[] args) {
        // �z��̐錾
        char[] array = {'a', 'b', 'c', 'd', 'e'};
        // �z��array�̑S�v�f�����ԂɎ��o���A�o�͂���
        for (char c : array) {  // �g��for���ŏ�������ꍇ
            System.out.print(c + " ");
        }
        System.out.println(); //���s
        // for���ŏ�������ꍇ
        for (int count = 0; count < array.length; count++) {
            System.out.print(array[count] + " ");
        }
    }
}
