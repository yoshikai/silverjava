package chap2.p051;

public class Main {
    public static void main(String[] args) {
        int i;
//        System.out.println("iの値 : " + i);  //NG コンパイルエラーとなる

        int[] array = new int[1];
        System.out.println("array[0]の値 : " + array[0]);
//        System.out.println("array[0]�̒l : " + array[1]);  //NG 実行時エラーとなる
    }
}
