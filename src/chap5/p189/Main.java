package chap5.p189;

class Test {
    static {
        System.out.println("1");
    }
    Test() {
        System.out.println("2");
    }
}

public class Main {
    static {
        System.out.println("3");
    }

    public static void main(String[] args) {
        System.out.println("4");
        Test obj = new Test();

        int i = 100;
    }
}

