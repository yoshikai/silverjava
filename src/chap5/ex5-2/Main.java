package chap5.ex5

public class Main {
    final int a;

    Main(int b) {
        a = b;
    }

    void method(int c) {
        a = c;
    }

    public static void main(String[] args) {
        Main obj = new Main(10);
        obj.method(20);
        System.out.println(obj.a);
    }
}
