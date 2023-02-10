package com.xworkz.assosiation.things;

public class Area {
	
	public String name ;
	public String population;
	public String street;
	
	public Area() {
		System.out.println("No-arg constructor of Area..\n");
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public void setPopulation(String population) {
		this.population=population;
	}
	public void setStreet(String street) {
		this.street=street;
	}
	
	public void display() {
		System.out.println("displaymethod of Area---");
		System.out.println("Area Name :"+this.name);
		System.out.println("Area Population :"+this.population);
		System.out.println("Area street Name :"+this.name);
	}
	
}
