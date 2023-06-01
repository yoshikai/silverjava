package chap3.p087;

public class CastSample {
    public static void main(String[] args){
        byte b = 10;    //1バイト（８ビット）
        int i = b;      //4バイト（３２ビット）
        short s = 30;   //2バイト
        i = s;
        long l = 1000;  //8バイト
        i = (int)l;
    }
}
