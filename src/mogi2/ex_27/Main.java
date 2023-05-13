package mogi2.ex_27;

class Foo {
    int a = 10;

    void methodA(Integer i) {
        a += i;
    }

    void methodB(StringBuilder sb) {
        sb.append(" " + sb);
    }
}

public class Main {
    public static void main(String[] args) {
        mogi2.ex_3.bb.Foo obj = new mogi2.ex_3.bb.Foo();
        int val = 10;
//        obj.methodA(val);   //NGのためコメントアウト
//        StringBuilder sb = new StringBuilder("hello");
//        obj.methodB(sb);    //NGのためコメントアウト
//        System.out.println(val + " : " + sb.toString());
    }
}
