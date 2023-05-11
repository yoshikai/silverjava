package chap4.p136;

public class Main {
    public static void main(String[] args) {
        // 外側の制御文 for
        for (int i = 1; i < 10; i++) {
            // 内側の制御文 if
            if ((i % 4) == 0) {
                System.out.println(i + " は 4 の倍数です。");
            }
        }
    }
}
