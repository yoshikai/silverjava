package chap3.p083;

public class Sample {
    public static void main(String[] args){
        String str1 = "abc";
        String str2 = "abcd".substring(0,3);    //abc
        System.out.println( str1 == str2);
        System.out.println("equals : " + str1.equals(str2));

        String str3 = "xyz";
        String str4 = "xyz";
        System.out.println( str3 == str4);
        System.out.println("equals : " + str3.equals(str4));
    }
}
