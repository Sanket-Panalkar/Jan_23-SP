package com.xworkz.inheritance.boot;

import com.xworkz.eclipse.project.things.Place;

public class PlaceRunner {
	
	public static void main(String[] args) {
		
		Place p = new Place();
		
		p.display(); 
		p.value("mudhol",25003236l,"bagalkot","karnataka","India");
	    p.display(); 
	    
	    Place p1 = new Place("gokak");
		p1.value(null,51625646l,"bijapur", "karnataka", "India");
		p1.display();
		
	    Place p2 = new Place("mantor",26476155l);
	    p2.value(null, 0, null, null, null);
	    p2.display();
	    
	    Place p3 = new Place("belagavi",356498651l,"belagavi");
	    p3.display();
	    
	    Place p4 = new Place("hubli",456165656l,"hubli","karnataka","India");
	    p4.display();
	    
	    

	}
}
