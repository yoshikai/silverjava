package mogi2.ex_59;

abstract class Super {
    int num;
    //[  1  ]

    Super(int num) {
        this.num = num;
    }

    void method() {
        System.out.println("Super:method()");
    }
}

//class Sub extends Super {   //NGのためコメントアウト
//    //[  2  ]
//
//    protected void method() {
//        System.out.println("Sub:method()");
//    }
//}
