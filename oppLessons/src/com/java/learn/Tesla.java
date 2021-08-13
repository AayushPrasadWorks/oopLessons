package com.java.learn;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Tesla extends ElectricCar {

	private String model;
	private int year;
	private int maxCharge;
	private int currentCharge;

	public Tesla(String model, int year) {
		this.model = model;
		this.year = year;
		this.maxCharge = super.maxCharge;
		this.currentCharge = super.maxCharge;
	}

	@Override
	void charge(int chargeAdded) {
		if ((chargeAdded + currentCharge) > maxCharge) {
			currentCharge = maxCharge;
		} else {
			currentCharge = chargeAdded + currentCharge;
		}
		// TODO Auto-generated method stub

	}

	public String toString() {
		try {
			String filename = "Tesla_List.txt";
			File carList = new File(filename);
			if (carList.createNewFile()) {
				System.out.println("First Car");
			} else {
				System.out.println("File already exists.");
			}
			FileWriter writer = new FileWriter(filename, true);
			writer.write(model + " Tesla " + year + "\n");
			writer.close();
			
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
			return "error";
		}

		return "Write Successfull";
	}

}
