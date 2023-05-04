package mogi1.ex

class A {
    private final double data;

    A(String data) {
        this.data = Double.parseDouble(data);
    }

    A(double data) {
        this.data = data;
    }

    A() {
    }

    public double getData() {
        return data;
    }
}

public class Main {
    public static void main(String[] args) {
        A a1 = new A("19.99");
        A a2 = new A(10.0);
        A a3 = new A();
        System.out.println(a1.getData() + " " + a2.getData()
                + " " + a3.getData());
    }
}
