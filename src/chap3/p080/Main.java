package chap3.p080;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Ab Cdefge");
        System.out.println("append()   : " + sb1.append("XYZ"));
        StringBuilder sb2 = new StringBuilder("Ab Cdefge");
        System.out.println("insert()   : " + sb2.insert(2, "ZZ"));
        StringBuilder sb3 = new StringBuilder("Ab Cdefge");
        System.out.println("delete()   : " + sb3.delete(0, 5));
        StringBuilder sb4 = new StringBuilder("Ab Cdefge");
        System.out.println("replace()  : " +
                sb4.replace(3, sb4.length(), "YYY"));
        StringBuilder sb5 = new StringBuilder("Ab Cdefge");
        System.out.println("substring(): " + sb5.substring(5));
    }
}

