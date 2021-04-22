package com.coforge.poly.PolyAndInheritence;

public class Overloading {
	public Overloading() {
		System.out.println("Default constructor ");
	}
	public Overloading(String message ) {
	   System.out.println("single parameter overloading constructor ");
	  
	}
	public int add(int a,int b ) {
		return a+b;
	}
	public void add(double a,double b ) {
		System.out.println(a+b);
	}
	
}
