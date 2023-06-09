package chap6;

import java.util.Arrays;
public class Car {
    public static void main(String[] args){
        String s = "d,c,b,a";
        String[] t = s.split(",");
        Arrays.sort(t);
        StringBuilder sb = new StringBuilder();
        Arrays.asList(t).forEach(str -> {
            sb.append(str.toUpperCase() + ",");
        });
        int i = sb.lastIndexOf(",");
        if(i > 0){
            System.out.println(sb.substring(0, i));
        }
        else{
            System.out.println(sb);
        }
    }
    public void run(){System.out.println("走る");}
    public void stop(){System.out.println("停車する");}
}
class Taxi extends Car implements Riderable{

    //売上
    private int sales = 0;

    public void openDoor(){System.out.println("お客さんを乗せるためにドアを開ける");}


    @Override
    public void ride(Human h) {
        System.out.println("お客さんを乗せる");
        //行き先を告げる。または行き先を聞く。
        String dest = listenRequest();
        //メーターを上げる
        meterUp();
        //走る
        run();
        //止まる
        stop();
        //メーターを止める
        meterDown();
        //料金を請求する
        int price = billing();
        //お客さんが請求された料金を支払う
        int money = h.pay(price);
        sales += money; //売り上げに計上
    }

    private String listenRequest() {
        System.out.println("お客さんから行き先を聞く");
        return "";
    }

    void meterUp(){System.out.println("メーターアップ");}
    void meterDown(){System.out.println("メーターダウン");}
    int billing(){System.out.println("請求金額を算出する");return 0;}
}
class Human {
    int pay(int price){return 1000;}
}
interface Riderable{
    void ride(Human h);
}
