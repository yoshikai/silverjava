package chap4.p141;

public class ArraySample {
    public static void main(String[] args){
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        for (int[] a : arr){
            for(int i=0; i<a.length;i++){
                System.out.print(a[i]);
            }
            System.out.print("\n"); //改行
        }
    }
}
