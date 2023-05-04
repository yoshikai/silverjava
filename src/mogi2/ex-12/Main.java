package mogi2.ex

public class Main {
    static String str = "Hi ";

    static String method(String s) {
        str += s;
        s += str;
        return s;
    }

    public static void main(String[] args) {
        System.out.println(method("taro"));
    }
}
