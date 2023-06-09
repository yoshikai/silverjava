package chap6.lesson.exam03;

class Parent {
    int num = 100;
    void show() {
        System.out.println(num);
    }
}
class Child extends Parent {
    int num = 500;
}
public class Main03 {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
    }
}