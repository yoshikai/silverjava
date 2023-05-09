package chap3.p093;

public class Main {
    public static void main(String[] args) {
        int i1 = 100;
        Integer obj = i1; // Boxing
        int i2 = obj;     // Unboxing
        method(i2);       // int型でメソッドの引数に渡す
    }

    static void method(Integer obj) { // Integer型で受け取る
        int i = obj + 100; // 計算も可能
        System.out.println(i);
    }
}
