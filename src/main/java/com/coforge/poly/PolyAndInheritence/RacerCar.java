package com.coforge.poly.PolyAndInheritence;


public class RacerCar extends Vehicle implements VehicleInterface{
	private int seaters;
		
	public RacerCar(int engineNo, String colour, int maxSpeed, int seaters) {
		super(engineNo, colour, maxSpeed);
		this.seaters = seaters;
	}

	public void start() {
		System.out.println("FourWheeler Started");
	}
	
	public void turn(String direction) {
		System.out.println("FourWheeler is turning to "+direction+" direction");
	}
	
	public void stopIgnition() {
		System.out.println("FourWheeler Igniion Stopped");
	}
	public boolean licence(boolean owns) {
		return owns;
	}
	

}
