package chap5

class Test {
    public void method(int a) {
        System.out.println("method(int a)");
    }

    public void method(long a) {
        System.out.println("method(long val)");
    }

    public void method(Integer a) {
        System.out.println("method(Integer val)");
    }

    public void method(int... a) {
        System.out.println("method(int... a)");
    }
    //public void method(int[] a) {
    //  System.out.println("method(int[] a)");
    //}
}

public class Main {
    public static void main(String[] args) {
        Test obj = new Test();
        obj.method(100);
    }
}