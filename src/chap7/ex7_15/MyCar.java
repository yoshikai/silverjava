package chap7.ex7_15;

import java.io.IOException;

public class MyCar extends Vehicle {
    int speed = 0;
    int year = 1960;
    int price = 0;

    public static void main(String[] args) {
        System.out.println("There comes my car!");
    }

    int getPrice() {
        return price;
    }

    int getYear() throws NullPointerException {
        return year;
    }

//    int getSpeed() throws IOException {  //NGのためコメントアウト
//        return speed;
//    }
}

class Vehicle {
    int getPrice() throws IOException {
        return 50000;
    }

    int getYear() {
        return 1990;
    }

    int getSpeed() {
        return 60;
    }
}
