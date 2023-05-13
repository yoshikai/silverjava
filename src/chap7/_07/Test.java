package chap7._07;

import java.io.FileNotFoundException;
import java.io.IOException;

class Super {
    void method() throws IOException {
    }
}

class SubA extends Super {
    void method() {
    }
}

class SubB extends Super {
    void method() throws FileNotFoundException {
    }
}

//class SubC extends Super {     //NGのためコメントアウト
//    void method() throws Exception {
//    }
//}

//class SubD extends Super {     //NGのためコメントアウト
//    void method() throws ClassNotFoundException {
//    }
//}

class SubE extends Super {
    void method() throws RuntimeException {
    }
}
