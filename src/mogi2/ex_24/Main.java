package mogi2.ex_24;

public class Main {
    public static boolean methodA() {
        System.out.print("A");
        return true;
    }

    public static boolean methodB() {
        System.out.print("B");
        return true;
    }

    public static void main(String[] args) {
        if (!methodA() && methodB())
            System.out.print("C");
        else
            System.out.print("D");
    }
}
