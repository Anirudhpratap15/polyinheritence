package com.coforge.poly.PolyAndInheritence;

public class FourWheeler extends TwoWheeler implements VehicleInterface,LuggageInterface{
	private int seaters;
//	public FourWheeler() {
//		}
	public FourWheeler(int engineNo, String colour, int maxSpeed, String gears, int seaters) {
		super(engineNo, colour, maxSpeed, gears);
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
	
	public void engineType(String type) {
		System.out.println("FourWheeler has " +type+" of engine");
	}
	
	public boolean licence(boolean owns) {
		return owns;
	}

}

