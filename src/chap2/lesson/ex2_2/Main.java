package chap2.lesson.ex2_2;

public class Main {
    public static void main(String[] args) {
        char my_char = 'c'; //OK
//        char your_char = 'int'; //NG char型なので[int]のような文字列は代入できない
//        char what = 'Hello';    //NG char型なので[int]のような文字列は代入できない
//        char what_char = "L";   //NG char型はダブルコーテーションでは代入できない（文字列型（String）として扱われる）
        char ok = '\u3456'; //OK ユニコードのキャラクタコードは代入できる
    }
}