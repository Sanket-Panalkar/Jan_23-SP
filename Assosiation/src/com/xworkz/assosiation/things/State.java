package com.xworkz.assosiation.things;

public class State {
	public String name;
	public String cmName;
	public String lang;
	public City city;
	
	public State() {
		System.out.println("No-arg constructor of State...\n");
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setcmName(String cmName) {
		this.cmName=cmName;
	}
	public void setLang(String lang) {
		this.lang=lang;
	
	}
	public void setCity(City city) {
		this.city=city; 
	}
	
	
	public void display() {
		System.out.println("display method of State---");
		System.out.println("State Name :"+this.name );
		System.out.println("CM Name :"+this.cmName );
		System.out.println("State Language :"+this.lang );
		if(city != null) {
		     this.city.display();
		}else {
			System.out.println("this city is not pointing to any memory..");
		}
		
		
	}
	
}
