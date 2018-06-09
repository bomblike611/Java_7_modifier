package com.iu.t5;

public class Car {
	
	final String color;
	final static String BRAND="BMW";//final은 static과 보통 같이씀.
	int price;
	int doors;
	
	public Car() {
		//this(); 자기자신의 또 다른 생성자 호출
		//생성자 첫줄에 기입. this생성자 위에 다른 코드를 쓰면 안됨.
		this("Black");
	}
	
	public Car(String color) {
		this(color,10000);
	}
	
	public Car(String color, int price) {
		this(color,price,2);
	}
	
	
	public Car(String color,int price,int doors) {
		this.color=color;
		this.price=price;
		this.doors=doors;
	}
	
	
	public void info() {
		System.out.println("=========================");
		System.out.println("Color : "+this.color);
		System.out.println("Price : "+this.price);
		System.out.println("Doors : "+this.doors);
	}

}
