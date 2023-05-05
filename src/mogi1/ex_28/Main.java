package mogi1.ex

public class Main {
    public static void main(String[] args) {
        boolean val = true; // �@
        switch (val) {
            case true: // �A
                System.out.println("true");
                break;
            default:
                System.out.println("false");
        }
    }
}
