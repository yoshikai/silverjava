package chap6

abstract class SuperA { // ���ۃN���X
    protected abstract void methodA();  // ���ۃ��\�b�h

    public void methodB() {
    }           // ��ۃ��\�b�h
}

class SubA extends SuperA {    // ��ۃN���X
    protected void methodA() {
    } //  �K�{ // ���ۃ��\�b�h�͕K������

    // �ȉ��ł�OK�B�A�N�Z�X�C���q�͓��������J�͈͂��L�����̂��g�p
    // public void methodA() { }
    public void methodB() {
    }    // �C�� // �K�v�ɉ����Ď����\
}
