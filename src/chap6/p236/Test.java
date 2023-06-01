package chap6.p236;

public class Test {
}

abstract class SuperA{
    protected abstract void methodA();
    public void methodB(){}
}
class SubA extends SuperA{
    @Override
    protected void methodA() {}
    public void methodB(){}
}