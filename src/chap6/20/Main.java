package chap6

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(0, "AAA");
        map.put(1, "BBB");
        map.put(2, "AAA");  // �l�̏d��
        map.put(1, "CCC");  // �L�[�̏d��
        for (int i = 0; i < map.size(); i++) {
            System.out.print(map.get(i) + " ");
        }
        System.out.println();
        Set<Integer> keys = map.keySet();
        for (Integer key : keys) {
            System.out.print(key + " ");
        }
        System.out.println();
        Collection<String> values = map.values();
        for (String value : values) {
            System.out.print(value + " ");
        }
    }
}
