package mogi1;

public class Mogi45 {
    int a, b;

    Mogi45(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void bar(Mogi45 obj) {
        obj.a = 200;
    }

    void setA(int a) {
        this.a = a;
    }

    int getA() {
        return a;
    }

    public static void main(String[] args) {
        Mogi45 obj = new Mogi45(10, 20);
        int a = 300;
        obj.setA(a);
        obj.bar(obj);
        System.out.print(a + " ");
        System.out.println(obj.getA());
    }
}

