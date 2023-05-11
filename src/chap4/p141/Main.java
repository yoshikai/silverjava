package chap4.p141;

public class Main {
    public static void main(String[] args) {
        loop1:  //ラベルloop1指定
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                System.out.println("x = " + x + " y = " + y);
                if (x == 1 && y == 1) {
                    System.out.println("break文の実行");
                    break loop1;  // ラベルloop1にbreak
                }
            }
        }
        System.out.println("------------------------------");
        loop2: // ラベルloop2指定
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                System.out.println("x = " + x + " y = " + y);
                if (x == 1 && y == 1) {
                    System.out.println("continue文の実行");
                    continue loop2;  // ラベルloop2にcontinue
                }
            }
        }
    }
}
