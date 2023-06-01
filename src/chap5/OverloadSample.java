package chap5;

public class OverloadSample {
    public static void main(String[] args){
        double a = plus(10,20.5);
        double b = plus(10.5, 10.3);
    }

    static double plus(int i, int j){
        return i+j;
    }

    static double plus(double d, double e){
        return d+e;
    }
}
