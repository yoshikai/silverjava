package chap4.p131;

public class Main {
    public static void main(String[] args) {
        for (int count = 0; count < 5; count++) {
            System.out.print(count + " ");
            count++;
        }
    }

    public void forSample(){
        int[] arr = {10,30,50,70,90};
        for(int i=1; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
