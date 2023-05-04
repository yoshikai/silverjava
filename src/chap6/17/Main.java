package chap6

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
        obj.methodA();
        obj.methodB();
    }
}
