package chap2.p043;

public class Main {
    public static void main(String[] args) {
        int num1 = 10;  //OK
        num1 = 20;      //OK 変数には代入可能
        final int num2 = 10;   //OK 定数宣言
//        num2 = 20;      // コンパイルエラー 定数には代入できない
    }
}
