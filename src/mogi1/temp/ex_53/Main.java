package mogi1.temp.ex_53;

class Parent {
    String name = "A";

    void print() {
        System.out.print(name);
    }
}

class Child extends Parent {
    String name = "B";

    void print() {
        System.out.print(name);
    }
}

public class Main {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.print();
        System.out.println(" " + obj.name);
    }
}
