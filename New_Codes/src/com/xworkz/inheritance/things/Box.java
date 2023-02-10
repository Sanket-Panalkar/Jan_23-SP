package com.xworkz.inheritance.things;

public class Box {

	public String shape;
	public String color;
	
	public Box() {
		System.out.println("no arg constructor of Gift..");
	}
	public Box(String shape) {
		this.shape = shape;
		System.out.println("String arg constructor of Gift...");
	}
	public void init(String shape , String color) {
		
		this.shape=shape;
		this.color=color;
	}
	public void display() {
		System.out.println(this.shape);
		System.out.println(this.color);
	}
}
