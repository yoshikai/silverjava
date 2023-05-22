package chap7.lesson;

import java.io.IOException;

public class ex15 {
	public static void main(String[] args) {
		MyCar my = new MyCar();
		try {
			my.getPrice();
			my.getYear();
			my.getSpeed();
		}catch (Exception e){

		}
		System.out.println("There comes my car!");
	}
}
class MyCar extends Vehicle {
	int speed = 0;
	int year = 1960;
	int price = 0;
	int getPrice() {    //9
		return price;
	}
	int getYear() throws NullPointerException { //12
		return year;
	}
//	int getSpeed() throws IOException {  //15   //NGのためコメントアウト
//		return speed;
//	}
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