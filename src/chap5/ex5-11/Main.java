package chap5.ex5

public class Main {
    public static void main(String[] args) {
        Main ojb1 = new Main();
        Main ojb2 = new Main();
        System.out.print(ojb1 == ojb2);
        ojb2 = operate(ojb1, ojb2);
        System.out.print(" " + (ojb1 == ojb2));
    }

    static Main operate(Main ojb1, Main ojb2) {
        Main ojb3 = ojb1;
        ojb1 = ojb2;
        return ojb3;
    }
}
