package chap3;

public class IfTest {
    public static void main(String[] args){
        int a = 1;
        int b = 2;
        int c = 3;
        if ((++a < b ? b++ : a--) > 0 || (c-- > b)) {
            System.out.println("1st a is " + a);
        }
        System.out.println("b : " + b);
        System.out.println("c : " + c);
    }
}
