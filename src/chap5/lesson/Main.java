package chap5.lesson;

public class Main {
    public static void main(String[] args) {
        Foo f1 = new Foo(500);                //10        f1.x = 500
        System.out.print(" 1 : " + f1.getX());  //11
        Main obj = new Main();                  //12
        Foo f2 = obj.toObj(f1);                 //13        f2.x = 100
        System.out.print(" 2 : " + f2.getX());  //14
    }

    Foo toObj(Foo f1) {                            //         f1.x = 500
        Foo f2 = new Foo(100);                  //17        f2.x = 100
        System.out.print(" 3 : " + f1.getX());  //18
        return f2;                              //19
    }
}
class Foo {
    int x;
    Foo(int a) {x = a;}
    void setX(int a) { x = a;}
    int getX() { return x;}
}