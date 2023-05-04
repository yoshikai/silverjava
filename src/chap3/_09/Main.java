package chap3._09;

public class Main {
    public static void main(String[] args) {
        int[] a1 = {10};
        int[] a2 = {10};
        System.out.println("a1 == a2 : " + (a1 == a2));

        int[] a3 = {10};
        int[] a4 = a3;
        System.out.println("a3 == a4 : " + (a3 == a4));
    }
}
