package chap7.ex7

class P {
    public void strToNum(String s)
            throws NumberFormatException {
        System.out.println("P : " + Integer.parseInt(s));
    }
}

class C extends P {
    public void strToNum(String s) throws Exception {
        System.out.println("C : " + Integer.parseInt(s));
    }
}

public class Main {
    public static void main(String[] args) {
        P p = new C();
        p.strToNum("a");
    }
}
