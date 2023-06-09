package chap6.lesson.exam04;

public class Main04 {
}
interface A {                       //1
    void x(int num);                //2
}
abstract class B {                  //4
    public void x(int num) {}       //5
    public abstract void y();       //6
}
class C extends B implements A {    //8
    public void y() {}              //9
}