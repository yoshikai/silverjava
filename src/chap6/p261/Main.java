package chap6.p261;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        HashMap m = new HashMap();
        m.put("aa", new String("bbbb"));
        m.put(1, "ccc");
        map.put(0, "AAA");
        map.put(1, "BBB");
        map.put(2, "AAA");  // 値の重複
        map.put(1, "CCC");  // キーの重複
        //キーの重複チェック
        if(map.containsKey(1)){
            //"1"がキーとして登録済みかをチェック
            //登録済の処理
        }
        else{
            //キーが未登録の場合、Mapに登録する
            map.put(1, "CCC");
        }
//        for (int i = 0; i < map.size(); i++) {
//            System.out.print(map.get(i) + " ");
//        }
//        System.out.println();
        Set<Integer> keys = map.keySet();
        for (Integer key : keys) {
            String val = map.get(key);
            System.out.println(key + " : " + val);
        }
//        System.out.println();
//        Collection<String> values = map.values();
//        for (String value : values) {
//            System.out.print(value + " ");
//        }
    }
}
