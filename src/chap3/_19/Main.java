package chap3._19;

public class Main {
    public static void main(String[] args) {
        int num = 20;
        String str = "num�̒l��";  //TODO 文字化け
        str += num < 10 ? "10����" : "10�ȏ�";  //TODO 文字化け
        System.out.println(str);
    }
}
