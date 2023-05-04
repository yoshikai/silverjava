package mogi2.ex

public class Main {
    int num;

    void methodA() {
        int num = 2;
        methodB();
        System.out.print(num);
    }

    void methodB() {
        num = 3;
    }

    public static void main(String[] args) {
        Main obj = new Main();
        int num = 1;
        System.out.print(obj.num);
        obj.methodA();
        System.out.print(num);
        System.out.print(obj.num);
    }
}