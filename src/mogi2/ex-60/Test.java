package mogi2.ex

interface A {
    Object method();
}

interface B extends A {
    Double method();
}

interface C extends A {
    Double[] method();
}

interface D extends B, C {
}