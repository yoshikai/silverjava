package chap2.p037;

public class Main {
    public static void main(String[] args) {
//        float x1 = 3_.1415F;     // NG
//        float x2 = 3._1415F;     // NG
//        long x3 = 999_99_9999_L; // NG
//        int x4 = _52;            // NG
        int x5 = 5_2;            // OK
//        int x6 = 52_;            // NG
        int x7 = 5_______2;      // OK
//        int x9 = 0x_52;          // NG
//        int x8 = 0_ x52;          // NG
        int x10 = 0x5_2;         // OK
        int x11 = 0_52;          // OK
    }
}
