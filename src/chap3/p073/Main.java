package chap3.p073;

public class Main {
    public static void main(String[] args) {
        int a = 10, b = 10, c = 10, d = 10;

//        int z = a++;
//        System.out.println("z value is: " + z);
//
//        int y = ++a;
//        System.out.println("y value is: " + y);
//        System.out.println("fist: " + a++); // a = a + 1;
//        System.out.println("second: " + a); // a = a + 1;

        System.out.println(++b); //11
        System.out.println(c--); //10 a = a - 1;
        System.out.println(--d); //9

        a = 10;
        b = 10;
        c = 10;
        d = 10;
        b = ++a; // 前置 ++aを「a = a + 1」に置き換えて
        System.out.println("a = " + a + " b = " + b);
        d = c++; // 後置
        System.out.println("c = " + c + " d = " + d);
    }
}
