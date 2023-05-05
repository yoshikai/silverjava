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
        mogi2.ex_78.my.exam.Main obj = new mogi2.ex_78.my.exam.Main();
        int num = 1;
        System.out.print(obj.num);
        obj.methodA();
        System.out.print(num);
        System.out.print(obj.num);
    }
}