package chap3.p104;

public class Main {
    public static void main(String[] args) {
        int num = 2;
        switch (num) {
            case 1:    // numの値が１の場合の処理
                System.out.println("numの値は1です。");
                break;   // breakによりswitchから抜ける
            case 2:    // numの値が2の場合の処理
                System.out.println("numの値は2です。");
                // break文がないため、次のdefault文の処理も実行
            default:   // numが1以外の場合は以下が実行される。
                System.out.println("defaultです。");
        }
    }
}
