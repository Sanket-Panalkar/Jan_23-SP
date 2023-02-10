package com.xworkz.inheritance.boot;

public class Engine {

	public String type;
	public int Capacity;
	public int cylinders;
	
	public void init(String type, int Capacity, int cylinders) {
		
		this.type = type;
		this.Capacity = Capacity;
		this.cylinders = cylinders;
	}
	public void displayEngine() {
		System.out.println("\n");
		System.out.println("JawaBike method started....");
		System.out.println("bike model :"+ type);
		System.out.println("bike engineCapacity :"+Capacity);
		System.out.println("bike speed :"+cylinders);
		
	}
}
