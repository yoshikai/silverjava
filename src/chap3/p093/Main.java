package chap3.p093;

public class Main {

    public static void main(String[] args) {
//        boolean b = isBig(5);
//        boolean c = isSmall(10);
//        System.out.println(b);
//        System.out.println(c);

//        //問題3・４
//        String a = numToString(1);
//        String s2 = numToString(2);
//        String s3 = numToString(3);
//        String s4 = numToString(9);
//        System.out.println(a + s2+ s3+ s4);
//
//        //問題5
//        String l1 = lengthCheck("abcdef");
//        String l2 = lengthCheck("abc");
//        System.out.println("abcdef:" + l1 + "\nabc   :" + l2);
//
//        //問題6
//        int m1 = multiply(5, 5);
//        int m2 = multiply(7,7);
//        System.out.println("5 * 5 :" + m1 + "\n7 * 7 :" + m2);

        //問題7
        int sft1 = shift(1);
        int sft2 = shift(2);
        System.out.println("1を1つシフト:" + sft1);
        System.out.println("2を1つシフト:"+ sft2);

    }

    static boolean isSmall(int a){
        boolean b = false;
        if( a > 10){
            //10以上の時の処理を。
            b = true;
        }
        else{
            //10以下の時の処理を。
            b = false;
        }
        return b;
    }

    /**
     * ※ここはメソッドのコメント。メソッドの仕様を記載する。
     * 10以上の数値であれば、trueを、10以下の数値であればfalseを返すメソッド
     * @param a int型の整数
     * @return boolean 引数が10以上の場合はtrueを、10以下の場合はfalse
     */
    static boolean isBig(int a){
//        return a > 10 ? true : false;
        //ここに処理を記述
        if(a > 10){
            return true;
            //以下、処理があろうともreturnがあればリターンします！
        }
        else{
            return false;
        }
//        return false;    //trueは暫定。処理の結果を返すように修正してください。
    }

    /**
     * 数値が１の場合は「A」に、２の場合は「B」を、３の場合は「C」を、
     * それ以外の1桁の数値の場合は「D」を返すメソッド
     * @param a
     * @return
     */
    static String numToString(int a){
        //silverの授業的にはこちらを推奨
        String s = null;
        switch (a) {
            case 1:
                s = "A";
                break;
            case 2:
                s = "B";
                break;
            case 3:
                s = "C";
                break;
            default: return "D";
        }
        return s;
//        switch (a) {
//            case 1: return "A";
//            case 2: return "B";
//            case 3: return "C";
//            default: return "D";
//        }
    }

    /**
     * 文字列（String）を受け取り、その文字列の長さが5文字以上の場合は、"長い"、5文字未満の場合は”短い”と返すメソッド
     * @param str
     * @return
     */
    static String lengthCheck(String str){
        return str.length() > 5 ? "長い" : "短い";
    }

    static int multiply(int a, int b){
        return a * b;
    }

    static int shift(int i){
        return i<<1;
    }
}
