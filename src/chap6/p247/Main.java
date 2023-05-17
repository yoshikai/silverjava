package chap6.p247;

abstract class Super {
    int x; int y;
    public abstract void print();
    public void method(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
class MyClass extends Super {
    public void print() {
        System.out.println("x : " + x + " y : " + y);
    }
}

public class Main {
    public static void main(String[] args) {
        // スーパークラスの変数にサブクラスオブジェクトを代入
        Super obj = new MyClass();
        obj.method(10, 20);     // スーパークラスのメソッド呼び出しOK
        obj.print();                //サブクラスのメソッド呼び出しOK
    }
}
