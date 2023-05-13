package mogi2.ex_40;

public class Main {
    public static void foo(String... args) {
        System.out.println("hello");
        for (String s : args) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        mogi2.ex_78.my_exam.abc.Main obj = null;
//        obj.foo();  //NGのためコメントアウト
    }
}
