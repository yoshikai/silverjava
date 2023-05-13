package mogi1.ex_56;

import java.nio.file.Path;
import java.util.Collection;

interface A {
}

interface B extends A {
    Collection a();
}

interface C extends A {
    Path a();
}

//interface D extends B, C {  //NGのためコメントアウト
//
//}
