package chap5.lesson;

public class Test {
    public static void main(String[] args){
        methodA();
    }
    static void methodA() {
        methodB();          //3行目 〇
        Test.methodB();     //4　〇
//        methodC();          //5　×   //コンパイルエラーのためコメントアウト
//        Test.methodD();     //6　×   //コンパイルエラーのためコメントアウト
    }
    static void methodB() {}
    void methodC() {
        methodB();          //10　Test.methodB()がベター（警告が出る）
        Test.methodB();     //11　〇
        methodD();          //12　〇
//        Test.methodD();     //13　×  //コンパイルエラーのためコメントアウト
    }
    void methodD() {}
}
