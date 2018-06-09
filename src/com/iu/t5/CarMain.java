package com.iu.t5;

public class CarMain {
	public static void main(String[] args) {
		Car c=new Car();
		c.info();
		
		Car c2=new Car("Red");
		c2.info();
		
		Car c3=new Car("White",80);
		c3.info();
		
		Car c4=new Car("Yellow",89540,5);
		c4.info();
	}
}
