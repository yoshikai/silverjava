package chap3;

public class StringSample {
    public static void main(String[] args){
        String x = "hello world";
        strAppend(x);
        System.out.println(x);
    }

    static void strAppend(String x){
        x = x + " java";
    }
}
