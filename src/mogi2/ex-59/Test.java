package mogi2.ex

abstract class Super {
    int num;
  [   �
    @   ]

    Super(int num) {
        this.num = num;
    }

    void method() {
        System.out.println("Super:method()");
    }
}

class Sub extends Super {
  [   �A   ]

    protected void method() {
        System.out.println("Sub:method()");
    }
}
