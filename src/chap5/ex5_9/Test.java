package chap5.ex5_9;

class Test {
    static void methodA() {
        methodB();
        Test.methodB();
//        methodC();    //※コンパイルエラーのためコメントアウト
//        Test.methodD();
    }

    static void methodB() {
    }

    void methodC() {
        methodB();
        Test.methodB();
        methodD();
//        Test.methodD();   //※コンパイルエラーのためコメントアウト
    }

    void methodD() {
    }
}
