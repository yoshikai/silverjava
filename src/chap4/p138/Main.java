package chap4.p138;

public class Main {
    public static void main(String[] args) {
        //式2が省略されていえるので無限ループ　※無限ループになりえるプログラムは絶対に書かないように！
        for (int i = 0; ; i++) {
            if (i == 3) {
                break;    // break によりfor文から抜ける
            }
            System.out.println("i = " + i);
        }
        System.out.println("for 終了後の処理");
    }
}
