package com.iu.t4;

public class Test {
	int num;
	
	
	//메서드 선언 공식
	//접근지정자 그외지정자 리턴타입 메서드명(매개변수선언){}
	
	
	//기본생성자, default constructor,빈생성자,
	public Test() {
		num=50;
		info2();
	}
	
	
	
	public void info() {
		System.out.println(this.num);
		this.info2();
	}
	
	public void info2() {
		System.out.println("TEST");
		System.out.println(this);
	}
	
	
}
