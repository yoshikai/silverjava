package chap6.ex6_9;

class SuperClass {
    SuperClass() {}
    SuperClass(int i) {
        System.out.println("The value of i is " + i);
    }
}
class SubClass extends SuperClass {
    SubClass(int j) {
    [ 1 ]
    [ 2 ]
    }
}
public class Main {
    public static void main(String[] args) {
        SubClass sub = new SubClass(5);
    }
}
