package chap6

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Integer i1 = 10;
        int i2 = 2;
        Integer i3 = i1;
        list.add(i1);
        list.add(i2);   // int�f�[�^��Boxing�ɂ��Integer�ɕϊ�
        list.add(i3);   // �d���v�f
        list.add(1, 5); // �C���f�b�N�X1�Ԗڂ�5��ǉ�
        //list.add("abc");
        System.out.println("size : " + list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        for (Integer i : list) {
            System.out.print(i + " ");
        }
    }
}
