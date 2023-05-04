package chap3._08;

public class Main {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 1_0;
        long n3 = 10L;
        byte n4 = 10;
        char n5 = 'a';
        float n6 = 10.0f;
        double n7 = 10.0;
        boolean n8 = true;

        System.out.println("n1 == n2   : " + (n1 == n2));
        System.out.println("n1 == n3   : " + (n1 == n3));
        System.out.println("n1 == n4   : " + (n1 == n4));
        System.out.println("n5 == 'a'  : " + (n5 == 'a'));
        System.out.println("n6 == n7   : " + (n6 == n7));
        System.out.println("n8 == true : " + (n8 == true));
    }
}
