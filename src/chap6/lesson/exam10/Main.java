package chap6.lesson.exam10;

public class Main {
}
class MySuperClass {
    private int x;
    MySuperClass(int i) {
        x = i;
        System.out.println("mySuperClass: " + x);
    }
}
class MySubClass extends MySuperClass {
    public static void main(String[] args) {
        new MySubClass();
        new MySubClass(3);
    }
    MySubClass(int i) {
        super(i);
    }
    MySubClass() {
        //※コンパイルエラー回避のため追加
        this(1);    //this(1)か、またはsuper(1)を追加するとOK
        System.out.println("Default");
    }
}