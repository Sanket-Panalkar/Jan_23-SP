package com.xworkz.inheritance.boot;

import com.xworkz.eclipse.project.things.CoolDrink;
import com.xworkz.eclipse.project.things.Fridge;

public class FridgeRunner {

	public static void main(String[] args) {
		
		Fridge fridge = new Fridge();
		fridge.init("LG", 25000);
		fridge.display();
				
		CoolDrink coolDrink =new CoolDrink();
		coolDrink.init("Slice", "Mango");
		coolDrink.show();
	    
		

	}

}
