package chap7.ex7_4;

public class Main {
    public static void main(String[] args) {
        System.out.println("1 ");
        x();
    }

    static void x() {
        y();
    }

    static void y() {
        if (Math.random() > 0.1) {
            throw new RuntimeException();
        }
        System.out.println("2 ");
    }
}
