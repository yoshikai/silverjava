package chap2.ex2_4;

public class Main {
    public static void main(String[] args) {
        int val1 = 10;
        final double val2 = 1.1;
        System.out.print(val1 * val2 + " ");
        val1 = 100;
//        val2 = 1.2; //NG finalのため再代入できない
        System.out.print(val1 * val2);
    }
}
