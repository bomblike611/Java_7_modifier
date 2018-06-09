package com.iu.overloading;

public class Hap {
	public void count(double a,double b) {
		System.out.println(a+b);
	}
	
	public void count(int a,int b) {
		System.out.println(a+b);
	}
	public void count(int a,float b) {
		System.out.println(a+b);
	}
	public void count(float a,int b) {
		System.out.println(a+b);
	}
	public void count(int a, double b) {
		System.out.println(a+b);
	}
	public void count(double a,int b) {
		System.out.println(a+b);
	}
}
