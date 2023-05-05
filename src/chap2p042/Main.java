package chap2p042;

public class Main {
    public static void main(String[] args) {
        int num1 = 10;
        long num2 = 30;
//        long num3 = 10000000000;  // NG コンパイルエラー
//        float num4 = 10.0;        // NG コンパイルエラー
        //※【参考プログラム】
        float num4 = (float)10.5;   // OK　double型の数値を明示的にキャストすることによりOKとなる。
    }
}
