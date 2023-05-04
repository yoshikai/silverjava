package chap2._09;

public class Main {
    public static void main(String[] args) {
        char[] c;                                 // �z��̐錾
        c = new char[3];                          // �z��̍쐬
        int[] i = new int[3];                     // �z��̐錾�ƍ쐬
        String str[] = {"Welcome ", "to ", "Java."};// �z��̐錾�Ə�����
        c[0] = 'A';
        c[1] = 'B';
        c[2] = 'C';       // �e�v�f�֒l�̑��
        i[0] = 100;
        i[1] = 200;
        i[2] = 300;       // �e�v�f�֒l�̑��
        System.out.println("str�̃T�C�Y: " + str.length);// �z��̗v�f��
        System.out.println("c[0]       : " + c[0]);
        System.out.println("i[1]       : " + i[1]);
    }
}
