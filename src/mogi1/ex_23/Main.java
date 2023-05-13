package mogi1.ex_23;

public class Main {
    public static void main(String[] args) {
        String str1 = "Orange";
        String str2 = str1.intern();
        String str3 = new String("Orange");
        if (str1 == str2) {
            System.out.print(str1 + " == " + str2 + ", ");
        }
        if (str1.equals(str3)) {
            System.out.println(str1 + " equals " + str3);
        }
    }
}
