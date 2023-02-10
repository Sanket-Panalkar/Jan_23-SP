package com.xworkz.inheritance.boot;
public class JawaBike {

	public String model;
	public int engineCapacity;
	public int speed;
	public int cost;
	public Engine jb = new Engine();
	
	public void init(String model, int engineCapacity, int speed, int cost) {
		
		this.model = model;
		this.engineCapacity = engineCapacity;
		this.speed = speed;
		this.cost = cost;
	}
	public void display() {
		System.out.println("\n");
		System.out.println("JawaBike method started....");
		System.out.println("bike model :"+ model);
		System.out.println("bike engineCapacity :"+engineCapacity);
		System.out.println("bike speed :"+speed);
		System.out.println("bike cost :"+cost);
		this.jb.displayEngine();
		
	}
	
	
	
}
