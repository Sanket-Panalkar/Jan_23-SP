package com.xworkz.inheritance.things;

public class Isro {

	public String places;
	public int satellites;
	public Scientist scientist;

	public void setPlaces(String places) {
		this.places = places;
	}

	public void setsatellites(int satellites) {
		this.satellites = satellites;
	}

	public void display() {
		System.out.println("display method of Isro..");
		System.out.println(this.places);
		System.out.println(this.satellites);
	}

}
