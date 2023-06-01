package chap5.p183;

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
        System.out.println(obj.staticVal);        // [警告あり]OK
        System.out.println(Test.staticVal);       // 本来はこちらが正
        obj.methodA();                            // OK
        obj.methodB();                            // [警告あり]OK
        Test.methodB();                           // 本来はこちらが正
    }
}
