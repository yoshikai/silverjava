package mogi1.ex

public class Main {
    public static void main(String[] args) {
        int a = 10;
        float f = 10.0f;
        double d = 10.0;
        a = (int) f;
        f = d;
        d = f;
    }
}
