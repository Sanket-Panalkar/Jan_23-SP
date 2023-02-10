package com.xworkz.inheritance.boot;

import com.xworkz.eclipse.project.things.Burger;

public class BurgerRunner {

	public static void main(String[] args) {
		
	   Burger b = new Burger("chicken");
	   Burger b1 = new Burger(200);
	   Burger b2 = new Burger("kfc",300);
	   Burger b3 = new Burger("onion tomato chilli",700);
	   b.display();
	   b1.display();
	   b2.display();
	   b2.display();
	}
	
}
