package com.xworkz.inheritance.things;

public class CoolDrink {

	public String name;
	public String flavour;
	
	public CoolDrink() {
		
		System.out.println("no arg constructor of CoolDrink...");
	}
	public CoolDrink(String name, String flavour) {
		this.name=name;
		System.out.println("String arg constructor of CoolDrink...");
	}
	public void init(String name,String flavour) {
		this.name=name;
		this.flavour=flavour;
		System.out.println("String , String arg method of CoolDrink...");
	}
	public void show(){
		System.out.println("show method of CoolDrink Running...");
		System.out.println("\n");
		System.out.println("coolDrink Name :"+this.name);
		System.out.println("coolDrink flavour :"+this.flavour);
	}
}
