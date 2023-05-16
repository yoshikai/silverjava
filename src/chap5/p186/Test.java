package chap5.p186;

public class Test {
    int instanceVal;             // �C���X�^���X�ϐ�
    static int staticVal;        // static�ϐ�

    int methodA() {
        return instanceVal;
    }           // OK

    int methodB() {
        return staticVal;
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
