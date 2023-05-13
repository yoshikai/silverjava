package mogi2.ex_43;

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
        mogi2.ex_78.my_exam.abc.Main obj = new mogi2.ex_78.my_exam.abc.Main();
        int num = 1;
//        System.out.print(obj.num);//NGのためコメントアウト
//        obj.methodA();//NGのためコメントアウト
//        System.out.print(num);
//        System.out.print(obj.num);//NGのためコメントアウト
    }
}