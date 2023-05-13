package mogi2.ex_60;

interface A {
    Object method();
}

interface B extends A {
    Double method();
}

interface C extends A {
    Double[] method();
}

//interface D extends B, C {   //NGのためコメントアウト
//}