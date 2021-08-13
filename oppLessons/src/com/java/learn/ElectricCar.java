package com.java.learn;

public abstract class ElectricCar {
	
	int maxCharge = 100;
	int currentCharge = 100;
	
	abstract void charge(int chargeAdded);
	
	public void drive() {
		if(currentCharge == 0) {
			System.out.println("Car out of Charge");
		}else {
			System.out.println("Driving");
		}
		
	}
	
	
	

}
