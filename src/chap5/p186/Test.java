package chap5.p186;

public class Test {
    int instanceVal;             // インスタンス変数
    static int staticVal;        // static変数

    int methodA() {
        return instanceVal;
    }           // OK

    int methodB() {
        return Test.staticVal;
    }             // OK

    //static int methodC() { return instanceVal; }  // NG
    static int methodD() {
        return staticVal;
    }      // OK

    static int methodE() {                          // OK
        Test obj = new Test();
        return obj.instanceVal;
    }
}
