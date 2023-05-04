package mogi1.ex;

import com.abc.A;
import com.xyz.B;

public class Main {
    public static void main(String[] args) {
        A obj = new B();   // line4
        System.out.println(obj.x);  // line5
    }
}
