package chap6.p227;

class SuperA {}                         //スーパークラスA
final class SuperB {}                   //スーパークラスB
class SuperC {void print() {}}          //スーパークラスC
class SuperD { final void print() {}}   //スーパークラスD
class SubA extends SuperA {}            //OK サブクラスA
//class SubB extends SuperB {}          //NG サブクラスB　finalクラスは継承できない
class SubC extends SuperC {void print() {}} //OK サブクラスC
//class SubD extends SuperD { void print(){ } } //NG サブクラスD finalメソッドは継承できない
