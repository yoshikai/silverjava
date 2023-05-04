package chap6

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
        System.out.println();
        int[] nums1 = {1, 0, 3};
        int[] nums2 = {1, 2, 3};
        System.out.println("compare  : " + Arrays.compare(nums1, nums2));
        System.out.println("mismatch : " + Arrays.mismatch(nums1, nums2));
    }
}
