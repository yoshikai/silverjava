package chap6.p236;

public class AbstractSample {
    public static void main(String[] args){
        ProcessB b = new ProcessB();
        b.doProcess();
    }
}

abstract class ProcessA{
    protected abstract void process1();
    protected abstract void process2();
    protected abstract void process3();

    public final void doProcess(){
        process1();
        process2();
        process3();
    }
}
class ProcessB extends ProcessA{

    @Override
    protected void process1() {
        System.out.println("process1");
    }

    @Override
    protected void process2() {
        System.out.println("process2");
    }

    @Override
    protected void process3() {
        System.out.println("process3");
    }
}