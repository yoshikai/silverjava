package chap3.p090;

public class Main {
    public static void main(String[] args) {
        double d = 10.5;
        //int i = d;
        int i = (int) d;
        System.out.println("i�̒l�F" + i);
        //foo(i);
        foo((short) i);
    }

    static void foo(short a) {
        System.out.println("a�̒l�F" + a);
    }
}
