package chap6._14;

interface XIF {
    void methodA();
}

interface YIF {
    void methodB();
}

interface SubIF extends XIF, YIF {
    void methodC();
}

class MyClass implements SubIF {
    public void methodA() {
        System.out.println("methodA()");
    }

    public void methodB() {
        System.out.println("methodB()");
    }

    public void methodC() {
        System.out.println("methodC()");
    }
}
