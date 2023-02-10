package com.xworkz.inheritance.boot;

import com.xworkz.eclipse.project.things.Box;

public class GiftRunner {

	public static void main(String[] args) {
		
		Box b =new Box("Square");
		b.display();
		
		b.init("circle", "red");
		b.display();
		
	}
}
