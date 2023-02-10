package com.xworkz.inheritance.things;

public class Shirt {

	public String brand;
	public String color;
	public int price;
	public String size;
	public Button b = new Button();
	
	public void init(String brand, String color, int price, String size) {
		
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.size = size;
		
	}
	
	public void display() {
		System.out.println("\n");
		System.out.println("shirt method running.....");
		System.out.println("shirt brand :"+brand);
		System.out.println("shirt color :"+brand);
		System.out.println("shirt price :"+brand);
		System.out.println("shirt size :"+brand);
		this.b.displayButton();
	}
	
	
		
	
}
