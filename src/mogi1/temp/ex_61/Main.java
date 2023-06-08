package mogi1.temp.ex_61;

interface Calc {
    public int exec(int x, int y);
}

public class Main {
    public static void main(String[] args) {
        int s = 0;
        Calc c = new Calc() {
            @Override
            public int exec(int x, int y) {
                return x + y;
            }
        };
        s = c.exec(3, 5);
        System.out.println(s);
    }
}
