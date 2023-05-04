package chap3._18;

public class Main {
    public static void main(String[] args) {
        char c = 'p';

        if (c == 'a') {
            System.out.println("c �̒l�� a �ł��B");  //TODO 文字化け
        } else if (c == 'b') {
            System.out.println("c �̒l�� b �ł��B");  //TODO 文字化け
        } else {
            System.out.println("c �̒l�� a �ł� b �ł�����܂���B");  //TODO 文字化け
            System.out.println("c �̒l�� " + c + " �ł��B");  //TODO 文字化け
        }
    }
}
