package chap5.p194;

class Test {
    void method1(int num) { // 引数として基本データ型を受け取る
        num += 10;
        System.out.println("定義側 " + num);
    }

    void method2(int[] array) { // 引数として参照型を受け取る
        array[0] += 10;
        System.out.println("定義側 " + array[0]);
    }
}

public class Main {
    public static void main(String[] args) {
        int num = 10;
        int[] array = {10};
        Test obj = new Test();
        obj.method1(num);
        System.out.println("呼び出し側  " + num);
        obj.method2(array);
        System.out.println("呼び出し側 " + array[0]);
    }
}
