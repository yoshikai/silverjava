package chap5.p187;

class Test {
    static String staticValue = "staticValue"; // static�ϐ�
    String instanceValue = "instanceValue";  // �C���X�^���X�ϐ�
}

public class Main {
    public static void main(String[] args) {
        Test obj = null;
        System.out.println(obj.staticValue);
        System.out.println(obj.instanceValue);
    }
}

