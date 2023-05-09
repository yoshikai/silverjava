package chap3.p073;

public class Main {
    public static void main(String[] args) {
        int a = 10, b = 10, c = 10, d = 10;
        System.out.println(a++);
        System.out.println(++b);
        System.out.println(c--);
        System.out.println(--d);

        a = 10;
        b = 10;
        c = 10;
        d = 10;
        b = ++a; // �O�u
        System.out.println("a = " + a + " b = " + b);
        d = c++; // ��u
        System.out.println("c = " + c + " d = " + d);
    }
}
