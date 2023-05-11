package chap4.p139;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            if ((i % 3) == 0) {
                System.out.println("処理をスキップします");
                continue;    // continue文によりfor文の式3へ制御を移す
            }
            System.out.println("i = " + i);
        }
        System.out.println("for 終了後の処理");
    }
}