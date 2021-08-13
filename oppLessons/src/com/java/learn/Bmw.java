package com.java.learn;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Bmw implements Car, Vehicle {
	
	private String model;
	private int year;
	private int maxRange;
	private int currentRange;
	private boolean isTrunkOpen;
	private boolean isEngineOn;
	
	
	public Bmw(String model, int year, int maxRange) {
		this.model = model;
		this.year = year;
		this.maxRange = maxRange;
		this.currentRange = this.maxRange;
		this.isTrunkOpen = false;
		this.isEngineOn = false;
		
	}
	@Override
	public void openTrunk() {
		this.isTrunkOpen = true;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void closeTrunk() {
		this.isTrunkOpen = false;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fillTank(int fuelAdded) {
		if(this.currentRange == 0) {
			this.currentRange = fuelAdded;
			
		}
		if((this.currentRange +fuelAdded) > this.maxRange) {
			this.currentRange = this.maxRange;
		}
		else {
			this.currentRange = this.currentRange +fuelAdded;
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		if(currentRange == 0 || !isEngineOn) {
			System.out.println("Car out of Gas or not on");
		}else {
			System.out.println("Drive");
		}
		
	}

	@Override
	public void startEngine() {
		isEngineOn = true;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stopEngine() {
		
		isEngineOn = false;
		// TODO Auto-generated method stub
		
	}
	
	public String toString() {
		try {
			String filename = "Bmw_List.txt";
			File carList = new File(filename);
			if (carList.createNewFile()) {
				System.out.println("First Car");
			} else {
				System.out.println("File already exists.");
			}
			FileWriter writer = new FileWriter(filename, true);
			writer.write(model + " BMW " + year + "\n");
			writer.close();
			
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
			return "error";
		}

		return "Write Successfull";
	}
	

}
