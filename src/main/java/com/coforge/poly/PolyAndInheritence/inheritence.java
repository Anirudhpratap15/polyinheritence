package com.coforge.poly.PolyAndInheritence;

public class inheritence {

	public static void main(String[] args) {
		System.out.println("Two Wheeler Details");
		TwoWheeler activa=new TwoWheeler(90129, "grey", 120, "Gearless");
		activa.start();
		activa.turn("Left");
		activa.stopIgnition();
		//activa.luggageComp();
		System.out.println("Is owner having licence? If yes True else False : "+activa.licence(false));
		System.out.println("\n\n");
		
		System.out.println("Four Wheeler Details");
		FourWheeler ford=new FourWheeler(90129, "red", 300, "Automatic",5);
		ford.start();
		ford.turn("Left");
		ford.stopIgnition();
		ford.engineType("Petrol");
		//ford.luggageComp();
		System.out.println("Is owner having licence? If yes True else False : "+ford.licence(true));
		System.out.println("\n\n");
		
		System.out.println("Vehicle Upcasting or Reference Casting");
		//Vehicle v=new TwoWheeler(); //Upcasting
//		v.start();
//		v.turn("Right");
//		v.stopIgnition();
//		System.out.println("Is owner having licence? If yes True else False : "+v.licence(true));
		
		
		//Vehicle v1=new Vehicle();// Cannot create object of abstract class
		
//		TwoWheeler t=(TwoWheeler) v; //Downcasting
//		t.luggageComp();
		
//		TwoWheeler t1=(TwoWheeler) v1; // ClassCastException 
//		t1.luggageComp();
	}
}