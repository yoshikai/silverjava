package chap5.p187;

class Test {
    static String staticValue = "staticValue"; // static変数
    String instanceValue = "instanceValue";  // インスタンス変数
}

public class Main {
    public static void main(String[] args) {
        Test obj = null;
        System.out.println(obj.staticValue);    //本来はTest.staticValueでアクセスしないといけない。
        System.out.println(obj.instanceValue);
    }
}

