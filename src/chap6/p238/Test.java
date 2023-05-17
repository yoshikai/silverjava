package chap6.p238;

abstract class SuperA {                 //抽象クラス
    protected abstract void methodA();  //抽象メソッド
    public void methodB() {}            //具象クラス
}

class SubA extends SuperA {             //具象クラス(または実装クラスとも)
    protected void methodA() {}         //具象クラスで実装必須のメソッド(ここでは中身は空)
    // ※以下のようにアクセス修飾子が親メソッドと同じか、
    // 大きい(ここではprotected→public)場合hOK
    // public void methodA() { }
    public void methodB() {}            //任意。単なるオーバーライドになる。
}
