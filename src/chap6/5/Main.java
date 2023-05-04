package chap6

class Foo {
    String str;
    int num;

    public Foo() {
        this("no_deta");
    }

    public Foo(String str) {
        this(str, 1);
    }

    public Foo(String str, int num) {
        this.str = str;
        this.num = num;
        System.out.println("String : " + this.str);
        System.out.println("int    : " + this.num);
    }
}

public class Main {
    public static void main(String[] args) {
        Foo f1 = new Foo();
        Foo f2 = new Foo("Hey");
        Foo f3 = new Foo("Bye", 200);
    }
}
