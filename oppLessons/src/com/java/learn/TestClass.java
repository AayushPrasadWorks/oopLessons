package com.java.learn;

public class TestClass {
	
	public static void main(String[] args) {
		
		Bmw x5 = new Bmw("X5", 2021, 400);
		Tesla modelS = new Tesla("Model S", 2019);
		
		System.out.println(modelS.toString());
		System.out.println(x5.toString());
	}

}
