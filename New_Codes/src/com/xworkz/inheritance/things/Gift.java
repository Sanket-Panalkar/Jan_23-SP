package com.xworkz.inheritance.things;

public class Gift {

	public String name;
	public int price;
	public Box box ;
	
	public Gift() {
		System.out.println("no arg constructor of Gift..");
	}
	public Gift(String name) {
		this.name = name;
		System.out.println("String arg constructor of Gift...");
	}
	public void init(String name , int price) {
		
		this.name=name;
		this.price=price;
	}
	public void display() {
		System.out.println(this.name);
		System.out.println(this.price);
		System.out.println(this.box);
	}
}
