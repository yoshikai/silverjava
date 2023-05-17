package chap6.p254;

class Super {
    static String x = "Super : x";
    String y = "Super : y";
    static void methodA() {
        System.out.println("Super : methodA()");
    }
    void methodB() {
        System.out.println("Super : methodB()");
    }
}
class Sub extends Super {
    static String x = "Sub : x";
    String y = "Sub : y";
    static void methodA() {
        System.out.println("Sub : methodA()");
    }
    void methodB() {
        System.out.println("Sub   : methodB()");
    }
}
public class Main {
    public static void main(String[] args) {
        Super obj = new Sub();
        System.out.println(obj.x);
        System.out.println(obj.y);
        obj.methodA();  //Super型のobjに代入した場合、インスタンスメソッド以外は親クラスのメソッドが呼ばれる
        obj.methodB();
    }
}
