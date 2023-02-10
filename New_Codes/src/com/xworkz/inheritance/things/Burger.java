package com.xworkz.inheritance.things;

public class Burger {

	public String type; 
	public int price;
	public String name;
	public String ingredients;
	public String calories;
	public boolean isVegetarian;
	public int patty;
    
	public Burger(String type) {
        this.type=type;
    }
	public Burger(int price) {
		this.price=price;
	}
	public Burger(String name, int price) {
		this.name=name;
		this.price=price;
	}
	public Burger(String ingredients, String calories) {
		this.ingredients=ingredients;
		this.calories=calories;
	}
	
	public void display() {
		System.out.println("Burger method running");
		System.out.println("Type of a Burger is :"+this.type);
		System.out.println("price :"+this.price);
		System.out.println("Name of a burger is :"+this.name +"Price :"+ this.price);
		System.out.println("ingredients used :"+this.ingredients+"Calories :"+this.calories);
		System.out.println();
	}
}

