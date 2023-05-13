package mogi2.ex_23;

public class Main {
    public static void main(String[] args) {
        String data = "hello123abc";
        int index = 5;
        if (data.length() > index && Character.isAlphabetic(data.charAt(index))) {
            index--;
        }
        if (Character.isLowerCase(data.charAt(index))) {
            index--;
        }
        if (Character.isDigit(data.charAt(index))) {
            index--;
        }
        if (data.endsWith(Character.toString(data.charAt(index)))) {
            index--;
        }
        System.out.println(index + " " + data.charAt(index));
    }
}
