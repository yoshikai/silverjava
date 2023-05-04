package mogi2.ex

class Super {
    A foo() {
        //more code
        return new A();
    }
}

class Sub extends Super {
    B foo() {
        //more code
        return new B();
    }
}
