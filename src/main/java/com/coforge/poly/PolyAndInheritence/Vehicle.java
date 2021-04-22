package com.coforge.poly.PolyAndInheritence;

abstract public class Vehicle {
	
	private int engineNo;
	private String colour;
	private int maxSpeed;
	
//	public Vehicle() {
//		}
	public Vehicle(int engineNo, String colour, int maxSpeed) {
		super();
		this.engineNo = engineNo;
		this.colour = colour;
		this.maxSpeed = maxSpeed;
	}
	
	protected boolean licence(boolean owns) {
		return owns;
	}
}