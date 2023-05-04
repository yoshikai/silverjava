package chap5

class Test {
    public void method(String s, int... a) {
        System.out.println(s + " �T�C�Y : " + a.length);
        for (int i : a) {
            System.out.println("  �� 2 �����̒l  :" + i);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Test obj = new Test();
        int[] ary = {10, 20, 30};
        obj.method("1 ��� ");
        obj.method("2 ��� ", 10);
        obj.method("3 ��� ", 10, 20);
        obj.method("4 ��� ", ary);
        //obj.method("5 ��� ", null);
    }
}
