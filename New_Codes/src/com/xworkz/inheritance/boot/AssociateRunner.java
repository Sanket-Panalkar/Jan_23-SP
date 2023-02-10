package com.xworkz.inheritance.boot;

import com.xworkz.eclipse.project.things.Phone;
import com.xworkz.eclipse.project.things.Shirt;
import com.xworkz.eclipse.project.things.Temple;
import com.xworkz.eclipse.project.things.Xworkz;

public class AssociateRunner {


	public static void main(String[] args) {
		
		Xworkz xz = new Xworkz();
		xz.display();
		Phone ph = new Phone();
		ph.display();
		Shirt sh = new Shirt();
		sh.display();
		Temple temp = new Temple();
		temp.display();
		JawaBike bike = new JawaBike();
		bike.display();
		
		
		
	}
}
