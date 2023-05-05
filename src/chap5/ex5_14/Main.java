package chap5.ex5_14;

public class Main {
    int val;

    static void x(int val) {
        val = 9;
        System.out.print(val + " ");
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.val = 8;
        int val = 10;
        System.out.print(val + " ");
        x(val);
        System.out.print(val + " ");
        System.out.print(obj.val + " ");
    }
}
