package com.xworkz.assosiation.things;

public class City {

	public String name;
	public String district;
	public String state;
	public Area area;
	
	public City() {
		System.out.println("No - Arg constructor of City...\n");
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setDistrict(String district) {
		this.district=district;
	}
	public void setState(String state) {
		this.state=state;
	}
	public void setArea(Area area) {
		this.area=area;
	}
	
	public void display() {
		System.out.println("display Method of City---");
		System.out.println("City Name :"+ this.name);
		System.out.println("District :"+ this.district);
		System.out.println("State :"+ this.state);
		if(this.area != null) {
			this.area.display();
		}else {
			System.err.println("this area is not pointing to any memory..");
		}
	}
}
