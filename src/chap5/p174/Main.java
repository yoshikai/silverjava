package chap5.p174;

class Test {
    void myPrint() {
        System.out.println("myPrint()");
    }

    void myPrint(String s) {
        System.out.println("myPrint(String s)");
    }

    void myPrint(int a) {
        System.out.println("myPrint(int a)");
    }

    void myPrint(int a, int b) {
        System.out.println("myPrint(int a, int b)");
    }
}

public class Main {
    public static void main(String[] args) {
        Test t = new Test(); // Testクラスのインスタンス化
        t.myPrint();
        t.myPrint(100);
        t.myPrint(100, 200);
        t.myPrint("yamamoto");
    }
}
