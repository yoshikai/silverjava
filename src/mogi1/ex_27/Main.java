package mogi1.ex

public class Main {
    static String data;

    public static void main(String[] args) {
        switch (data) {
            case "a":
                data += "xx";
            default:
                data += "yy";
            case "b":
                data += "zz";
        }
        System.out.println(data);
    }
}
