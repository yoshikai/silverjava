package chap3.ex3_18;

public class Main {
    public static void main(String[] args) {
        String str = new String("Hello");
        StringBuilder sb = new StringBuilder("Hello");
        str.concat(" dear");
        sb.append(" dear");
        System.out.println("str: " + str + ", sb: " + sb);
    }
}