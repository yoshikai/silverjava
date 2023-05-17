package chap6.p230;

class SuperA {
    int num;
    public void methodA() {
        num += 100;
    }
    public void print() {
        System.out.println("num値 :" + num);
    }
}
class SubA extends SuperA {
    public void methodA() {
        num += 500;
    }
    public void methodB() {
        methodA();          // メソッドA呼び出し(500をプラス)
        print();            // スーパークラスのprintメソッド呼び出してnumの値を出力
        super.methodA();    // スーパークラスのmethodA呼び出し(100をプラス)
        print();            // スーパークラスのprintメソッド呼び出してnumの値を出力
    }
}
public class Main {
    public static void main(String[] args) {
        SubA obj = new SubA();
        obj.methodB();
    }
}
