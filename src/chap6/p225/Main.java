package chap6.p225;

class SuperA {    //スーパークラス
    void methodA() {
        System.out.println("SuperA:methodA()");
    }

    static void methodB() {
        System.out.println("SuperA:methodB()");
    }
}

class SubA extends SuperA {  // サブクラス
    void methodA() {
        System.out.println("SubA:methodA()");
    }
    //※親クラスのメソッドのオーバーライドでstatic化はコンパイルエラーとなる
    //static void methodA() { System.out.println("SubA:methodA()"); }
    static void methodB() {
        System.out.println("SubA:methodB()");
    }
    //※親クラスのstaticメソッドのオーバーライドで非static化はコンパイルエラーとなる
    //void methodB() { System.out.println("SubA:methodB()"); }
}

public class Main {
    public static void main(String[] args) {
        SubA obj = new SubA();
        obj.methodA();
        obj.methodB();
    }
}
