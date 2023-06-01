package chap3.p106;

public class SwitchSample {
    public static void main(String[] args) {
        final String TEST = "test";
        switch (TEST) {
            case "test":
            case "sample":
                // numが1か2の場合、実行される。
                System.out.println("1 または 2");
                break;
            case "hoge":
            case "fuga":
                // numが3か4の場合、実行される。
                System.out.println("3 または 4");
                break;
            default:
                // numが1から4以外の場合、実行される。
                System.out.println("default");
        }
    }
}
