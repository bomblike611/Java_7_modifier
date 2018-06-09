package com.iu.t3;

import java.util.Scanner;

public class MemberMain {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		Member m=new Member();
		m.setName("iu");
		m.setAge(20);
		m.setHeight(163.5);
		m.setWeight(72.3);
		//키:163.5
		//몸무게:72.3

		
		m.test();
		m.info();

		
		m.test();
		m.info();
	}
}
