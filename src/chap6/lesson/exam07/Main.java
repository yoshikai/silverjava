package chap6.lesson.exam07;

class A {
    A(String message) {    //2
        System.out.println(message + " from A.");
    }

    /**
     * サブクラスのデフォルトコンストラクタにsuper()を追加するか、
     * 親クラスにデフォルトコンストラクタを作成するとコンパイルエラーは回避できます。
     */
//    A(){}   //※コンパイルエラー回避のため追加
}
class B extends A {
    B() {                  //7
        super("aaaaa");  //※コンパイルエラー回避のため追加
        System.out.println("Hello from B.");
    }
}
public class Main {
    public static void main(String[] args) {
        B b = new B(); //11
    }
}