package chap6._10;

abstract class X {                // ���ۃN���X
    protected abstract void methodA();
}

abstract class Y extends X {
}    // ���ۃN���X

class Z extends Y {               // ��ۃN���X
    protected void methodA() {
    }
    //public void methodA() { }     // public�C���q�ł�OK
    //void methodA() { }            // �C���q�̎w��Ȃ���NG
}
