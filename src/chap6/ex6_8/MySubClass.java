package chap6.ex6_8;

class MySuperClass {
    private int x;

    MySuperClass(int i) {
        x = i;
        System.out.println("mySuperClass: " + x);
    }
//  [     �       //TODO 文字化けのためコメントアウト
//    @     ]
}

public class MySubClass extends MySuperClass {
    public static void main(String[] args) {
        new MySubClass();
        new MySubClass(3);
    }

    MySubClass(int i) {
        super(i);
    }

    MySubClass() {
//    [     �A     ]      //TODO 文字化けのためコメントアウト
        System.out.println("Default");
    }
}
