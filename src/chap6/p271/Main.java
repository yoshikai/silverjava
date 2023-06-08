package chap6.p271;

import mogi2.ex_45.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] ary = {"A", "B", "C"};
        List<String> list = Arrays.asList(ary);
        //list.add("D");
        list.set(2, "D");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
//        list.remove(1);

        List<String> strList = new ArrayList<>();
        strList.add("a");
        strList.add("b");
        strList.add("c");
        strList.add("d");
        strList.remove(1);


//        System.out.println();
//        int[] nums1 = {1, 0, 3};
//        int[] nums2 = {1, 2, 3};
//        System.out.println("compare  : " + Arrays.compare(nums1, nums2));
//        System.out.println("mismatch : " + Arrays.mismatch(nums1, nums2));
    }
}
