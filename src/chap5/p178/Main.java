package chap5.p178;

class Test {
    public void method(String s, int... a) {
        System.out.println(s + " サイズ : " + a.length);
        for (int i : a) {
            System.out.println(" 第 2 引数の値:" + i);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Test obj = new Test();
        int[] ary = {10, 20, 30};
        obj.method("1 回目 ");
        obj.method("2 回目 ", 10);
        obj.method("3 回目 ", 10, 20);
        obj.method("4 回目 ", ary);
        //obj.method("5　回目", null);
    }
}
