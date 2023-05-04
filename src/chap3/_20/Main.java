package chap3._20;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        if (a > 0) {
            System.out.println("a�͐��̒l�ł��B");  //TODO 文字化け
            if (a % 2 == 0) {
                System.out.println("a�͋����ł��B");  //TODO 文字化け
            }
        } else {
            if (a == 0) {
                System.out.println("a��0�ł��B");  //TODO 文字化け
            } else {
                System.out.println("a�͕��̒l�ł��B");  //TODO 文字化け
            }
        }
    }
}
