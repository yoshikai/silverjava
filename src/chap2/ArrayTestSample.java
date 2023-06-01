package chap2;

public class ArrayTestSample {
    public static void main(String[] args){
        int[] arr = {10,20,30,40,50,60,70,80,90};
        System.out.println(arr[0] + arr[8]);
        System.out.println(arr[1] + arr[7]);
        System.out.println(arr[2] + arr[6]);
        System.out.println(arr[3] + arr[5]);
    }

    static void arrayTest1(){
        int[] arr = {10,20,30,40,50,60,70,80,90};
    }

    static void arrayTest2(){
        int[][] arr = {{10,20,30},{40,50,60},{70,80,90}};
    }


}
