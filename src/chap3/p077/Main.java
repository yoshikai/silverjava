package chap3.p077;

public class Main {
    public static void main(String[] args) {
        int a = 10, b = 10, c = 10, d = 10;
        boolean result1 = a++ > 10 & ++b > 10;
        System.out.println(
                "result1:" + result1 + " a:" + a + " b:" + b);
        boolean result2 = c++ > 10 && ++d > 10;
        System.out.println(
                "result2:" + result2 + " c:" + c + " d:" + d);
    }
}