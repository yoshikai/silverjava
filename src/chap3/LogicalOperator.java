package chap3;

/**
 * 論理演算子サンプル
 */
public class LogicalOperator {
    public static void main(String[] args){
        /**
         * オマケ
         * 論理演算子 反転(ビットNOT)
         *  1 の場合は 0 に、 0 の場合は 1 にします
         */
        int a = ~1; //1 → 0001 → ビット反転 → 1110
        int b = ~0;
        System.out.println("a :" + a);
        System.out.println("b :" + b);

    }
}
