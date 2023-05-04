package chap5.ex5

public class Main {
    public static String msg = "hello";
    int val1;

    static {
        val1 = 1;
    }

    public static void main(String[] args) {
        System.out.println(msg + " " + val1);
    }
}