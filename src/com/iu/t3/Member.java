package com.iu.t3;

import java.util.Scanner;

public class Member {
	private String name;
	private int age;
	private double weight;
	private double height;
	
	//메소드를 통해 변수 입력, 가져오기.


	public void test() {
		double result=(height-100)*0.95;
		if(result>weight) {
			System.out.println("저체중입니다.");
		}else if(result<weight) {
			System.out.println("비만입니다.");
		}else {
			System.out.println("정상입니다.");
		}
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
	 this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void info() {
		System.out.println("이름 :"+name);
		System.out.println("나이 :"+age);
		System.out.println("몸무게 :"+weight);
		System.out.println("키 :"+height);
	}
}
