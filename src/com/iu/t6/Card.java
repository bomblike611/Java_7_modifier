package com.iu.t6;

public class Card {
	
	public static int width=3;
	public static int heigth=7;
	String shape;
	String color;
	int num;

	public Card() {}

	public Card(String shape,String color,int num) {
		this.shape=shape;
		this.color=color;
		this.num=num;
	}

	public void info() {
		System.out.println("=======================");
		System.out.println("Shape : "+this.shape);
		System.out.println("Color : "+this.color);
		System.out.println("Num : "+this.num);
		//Card.info2();
	}
	
	public static void info2() {
		System.out.println("Width : "+Card.width);
		System.out.println("Heigth : "+Card.heigth);
	}

}
