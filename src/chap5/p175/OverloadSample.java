package chap5.p175;

public class OverloadSample {

    public static void main(String... args){
        printHello("Stringだけど");
        printHello(10);
        printHello(100.1);
    }
    static void printHello(String s){
        System.out.println(s + " Hello!");
    }
    static void printHello(int i){
        System.out.println(i + " Hello!");
    }
    static void printHello(double d){
        System.out.println(d + " Hello!");
    }
}
