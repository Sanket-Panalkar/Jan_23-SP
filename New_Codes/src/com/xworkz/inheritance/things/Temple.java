package com.xworkz.inheritance.things;

public class Temple {
	
public String name;
public String location;
public double timing;
public God g = new God();

public void init(String name, String location, double timing) {
	this.name = name;
	this.location = location;
	this.timing = timing;
}

public void display() {
	System.out.println("\n");
	System.out.println("Temple Method Running....");
	System.out.println("Temple Name :"+name);
	System.out.println("Temple loctation :"+location);
	System.out.println("Temple timing :"+timing);
	this.g.displayGod();
}
}
