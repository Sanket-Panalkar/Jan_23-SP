package com.xworkz.inheritance.things;

public class Fridge {

	public String brand;
	public int price;
	public CoolDrink cd;
	
	public Fridge() {
		System.out.println("non arg constructor of fridge....");
	}
	public Fridge(String brand, int price) {
		this.brand=brand;
		this.price=price;
		System.out.println("String , int arg of constructor Fridge");
	}
	
	public void init(String brand, int price) {
		this.brand=brand;
		this.price=price;
		System.out.println("String , int arg  method of Fridge");
	}
	public void display() {
		System.out.println("\n");
		System.out.println("display method of Fridge Running...");
		System.out.println("Fridge brand :"+this.brand);
	    System.out.println("Fridge price :"+this.price);
	    System.out.println(this.cd);
	    if(cd != null) {
	    	System.out.println(cd);
	    }else {
	    	System.err.println("value is not initialized...");
	    }
	    
	}
	
	
}
