package mogi2.ex

class A {
    final double num;

    A(String num) {
        this.num = Double.parseDouble(num);
    }

    A(int num) {
        this.num = num;
    }

    A() {
    }

    double getNum() {
        return num;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new A("123.45").getNum());
        System.out.println(new A(123).getNum());
    }
}
