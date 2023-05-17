package chap6.p237;

abstract class X {      //抽象クラス
    protected abstract void methodA();
}
abstract class Y extends X {}       //抽象クラスを継承した抽象クラス
class Z extends Y {                 //具象クラス
    protected void methodA() {}
    //public void methodA() { }     //public修飾子でもOK
    //void methodA() { }            //修飾子の未指定はNG
}
