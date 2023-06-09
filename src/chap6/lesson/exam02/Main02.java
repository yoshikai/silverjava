package chap6.lesson.exam02;

class A {}
class B extends A {}
public class Main02 {
    public static void main(String[] args) {
        A[] ary = new A[2];
        ary[0] = new A();
        ary[1] = new B();
    }
}