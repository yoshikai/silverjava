package chap6.p260;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        String[] ary = {"CCC", "AAA", "BBB"};
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add(ary[0]);
        hashSet.add(ary[1]);
        hashSet.add(ary[2]);
        hashSet.add(ary[0]);
        System.out.println("HashSet size : " + hashSet.size());
        for (String s : hashSet) {
            System.out.print(s + " ");
        }
    }
}
