package chap7.p327;

import java.io.FileNotFoundException;
import java.io.IOException;

class Super { void method() throws IOException {}}
class SubA extends Super { void method() {}}
class SubB extends Super { void method() throws FileNotFoundException {}}
//NGのためコメントアウト
//class SubC extends Super { void method() throws Exception {}}
//NGのためコメントアウト
//class SubD extends Super { void method() throws ClassNotFoundException {}}
class SubE extends Super { void method() throws RuntimeException {}}
