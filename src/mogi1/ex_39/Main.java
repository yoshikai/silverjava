package mogi1.ex_39;

class A {
    static String val;

    A(String val) {
        this.val = val;
    }

    static String getVal() {
        return val;
    }
}

public class Main {
    public static void main(String[] args) {
        A obj = new A("Japan");
        obj = null;
        System.out.println(A.getVal());
    }
}
