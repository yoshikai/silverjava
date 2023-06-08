package mogi1.temp.ex_14;

public class Main {
    String s;

    void foo(String s) {
        String a = "Dr.";
        s += a;
    }

    String getS() {
        return s;
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.foo("who");
        System.out.println(obj.getS());
    }
}
