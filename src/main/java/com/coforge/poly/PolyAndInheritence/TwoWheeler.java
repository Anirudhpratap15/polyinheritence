package com.coforge.poly.PolyAndInheritence;

public class TwoWheeler extends Vehicle implements VehicleInterface,LuggageInterface{
	private String gears;
	
//	public TwoWheeler() {
//		}

	public TwoWheeler(int engineNo, String colour, int maxSpeed, String gears) {
		super(engineNo, colour, maxSpeed);//super keyword should always be first statement in th declaration 
		this.gears = gears;
		System.out.println(engineNo+" : " +colour+" : "+maxSpeed+" : " +gears);
	}
	
	public void start() {
		System.out.println("TwoWheeler Started");
	}
	
	public void turn(String direction) {
		System.out.println("TwoWheeler is turning to "+direction+" direction");
	}
	
	public void stopIgnition() {
		System.out.println("TwoWheeler Ignition Stopped");
	}
	public void luggageComp() {
		System.out.println("Two Wheeler Has Luggage Compartment");
	}
	public boolean licence(boolean owns) {
		return owns;
	}

}
