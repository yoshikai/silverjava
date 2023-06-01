package chap3.p105;

public class SwitchSample {
    public static void main(String[] args) {
        int num = 3;
        //こういう条件判断も数値を返しているのでOK
        switch ( num > 3 ? 1 : 2 ) {
            case 1:
            case 2:
                // numが1か2の場合、実行される。
                System.out.println("1 または 2");
                break;
            case 3:
            case 4:
                // numが3か4の場合、実行される。
                System.out.println("3 または 4");
                break;
            default:
                // numが1から4以外の場合、実行される。
                System.out.println("default");
        }
    }
}
