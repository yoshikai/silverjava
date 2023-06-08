package mogi1.temp.ex_72;

public class Main {
    void methodA() throws Exception {
    }   // line1

    void methodB() throws RuntimeException {
    }  // line2

    public static void main(String[] args) {
        Main obj = new Main();
//        obj.methodA();   // line3   //NGのためコメントアウト
        obj.methodB();   // line4
    }
}
