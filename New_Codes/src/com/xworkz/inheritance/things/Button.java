package com.xworkz.inheritance.things;

public class Button {

	public String material;
	public String shape;
	public float size;
	public String color;
	
	public void init(String material, String shape, float size, String color) {
		
		this.material = material;
		this.shape = shape;
		this.size = size;
		this.color = color;
		
	}
	
	public void displayButton() {
		System.out.println("\n");
		System.out.println("Button method running.....");
		System.out.println("BUtton material :"+material);
		System.out.println("Button Shape :"+shape);
		System.out.println("Button Size :"+size);
		System.out.println("BUtton color :"+color);
	}
}
