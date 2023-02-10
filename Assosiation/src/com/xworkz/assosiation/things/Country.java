package com.xworkz.assosiation.things;

public class Country {

	public String name;
	public String president;
	public boolean developed;
	public State state;
	
	public Country() {
		System.out.println("No-arg constructor of Country...\n");
	}
	public void setName(String name)  {
		this.name=name;
	}
	public void setPresident(String president) {
		this.president=president;
	}
	public void setDeveloped(boolean developed) {
		this.developed=developed;
	}
	
	public void setState(State state) {
		this.state=state;
	}
	
	public void display() {
		System.out.println("display method of Country---");
		System.out.println("Country :"+this.name);
		System.out.println("President :"+this.president);
		System.out.println("not developed :"+this.developed);
		if(state!=null) {
			this.state.display();
		}else {
			System.out.println("state is not pointing to any memory...");
		}
	}
}
