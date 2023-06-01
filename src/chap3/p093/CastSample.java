package chap3.p093;

public class CastSample {
    public void main(String[] args){
        short s1 = 10;
        s1++;
        //(short)にキャストしないとコンパイルエラー。暗黙の変換でint型で計算される
//        s1 = s1 + 1;
        System.out.println(s1);
    }
}
