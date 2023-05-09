package chap3.p095;

public class Main {
    public static void main(String[] args) {
        int num = 5;
        if (num < 10) {
            System.out.println("numは10未満です。");
        }
        num = 20;
        if (num >= 100)
            System.out.println("numは100以上です。");
        System.out.println("2つ目のif文の後の処理");
    }
}
