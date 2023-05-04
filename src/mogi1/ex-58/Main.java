package mogi1.ex

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(1, "c");
        map.put(3, "b");
        System.out.print("Size: " + map.size());
    }
}
