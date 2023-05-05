package chap2.p047;

public class Main {
    //var a = 100;            // コンパイルエラー
    //static var b = 100;     // コンパイルエラー
    public static void main(String[] args) {
        var c = "hello";        // OK
        var d = 100;            // OK
        //var e;                // コンパイルエラー
        //var f = null;         //　コンパイルエラー
        final var g = 100;      // OK
        //var final h = 100;    // コンパイルエラー
    }
}


