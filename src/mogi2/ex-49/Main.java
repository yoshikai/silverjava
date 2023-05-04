package mogi2.ex

interface MyInter {
    void method();
}

class Sample {
    public void method() {
        System.out.println("Sample");
    }
}

class Test extends Sample implements MyInter {
}

public class Main {
    public static void main(String[] args) {
        new Test().method();
    }
}
