package chap3;

public class StringBuilderSample {
    public static void main(String[] args){
        StringBuilder x = new StringBuilder("Hello world");
//        strAppend(x);
        System.out.println(x);
    }

    static void strAppend(StringBuilder x){
        x = x.append(" java");
    }
}
