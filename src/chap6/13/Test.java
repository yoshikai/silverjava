package chap6

interface MyInter {
    void methodA();
}

class Super {
    void methodB() {
    }
}

class MyClass extends Super implements MyInter {
    public void methodA() {
    }
}
