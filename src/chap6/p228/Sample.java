package chap6.p228;

public class Sample {
    public static void main(String[] args){
        Item i = new Item();
        Item i2 = new Item("鮭おにぎり", 100);
    }
}

/**
 * 販売する商品名を表すクラス
 */
class Item{
    //商品名
    private String name;
    //価格
    private int price;

    /**
     * デフォルトコンストラクタ。
     * 販売する商品名がまだ未定の場合に使用してください。
     */
    public Item(){
        this("【仮】商品名未定", 0);
    }

    /**
     * 販売価格を引数に受け取るコンストラクタ。
     * 金額だけ決まっていて、商品名が決まっていない商品の時に使用してください。
     * @param price
     */
    public Item(int price){
//        this.name = "商品名未確定";
//        this.price = price;
        this("【仮】商品名未定", price);
    }

    /**
     * コンストラクタの引数に名前と販売価格が決まっている商品に対してのコンストラクタ
     * @param name
     * @param price
     */
    public Item(String name, int price){
        this.name = name;
        this.price = price;
    }
}