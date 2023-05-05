package chap5._09;

class Test {
    int instanceVal = 100;
    static int staticVal = 200;

    void methodA() {
        System.out.println("methodA(): " + instanceVal);
    }

    static void methodB() {
        System.out.println("methodB(): " + staticVal);
    }
}

public class Main {
    public static void main(String[] args) {
        //System.out.println(Test.instanceVal);   // NG
        System.out.println(Test.staticVal);       // OK
        //Test.methodA();                         // NG
        Test.methodB();                           // OK
        Test obj = new Test();
        System.out.println(obj.instanceVal);      // OK
        System.out.println(obj.staticVal);        // OK
        obj.methodA();                            // OK
        obj.methodB();                            // OK
    }
}
