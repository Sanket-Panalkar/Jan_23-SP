package com.xworkz.inheritance.things;

public class Rainbow {

	public String color;
	public float width;
	public String shape;
	public String location;
	public String direction;
	public double intensity;
	public double opacity;
	public float duration;
	
	public Rainbow(String color, float width, String shape, String location, String direction, double intensity, double opacity, float duration) {
		this.color=color;
		this.width=width;
		this.shape=shape;
		this.location=location;
		this.direction=direction;
		this.intensity=intensity;
		this.opacity=opacity;
		this.duration=duration;
	}
	
	public void display() {
		System.out.println("display method running...\n");
		System.out.println("color :"+this.color+"\nwidth of rainbow :"+this.width+"\nshape of rainbow :"+shape+"\nlocation :"+location+"\ndirection :"+direction+"\nintensity :"+intensity+"\nopacity :"+opacity+"\ndutarion :"+duration);
	}
}
