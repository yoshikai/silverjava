package mogi1.ex_43;

public class Main {
    int a;
    static int b;

    Main() {
        int i = 0;
        while (i < 5) {
            i++;
            a++;
            b++;
        }
    }

    public static void main(String[] args) {
        Main o1 = new Main();
        Main o2 = new Main();
        System.out.println(o1.a + " " + o1.b);
        System.out.println(o2.a + " " + o2.b);
    }
}
