package mogi1.temp.ex_27;

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
