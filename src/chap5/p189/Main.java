package chap5.p189;

class Test {
    static {
        System.out.println("Testクラス : staticイニシャライザ");
    }

    Test() {
        System.out.println("Testクラス : コンストラクタ");
    }
}

public class Main {
    static {
        System.out.println("Mainクラス : staticイニシャライザ");
    }

    public static void main(String[] args) {
        System.out.println("Mainクラス : mainメソッド");
        Test obj = new Test();
    }
}

