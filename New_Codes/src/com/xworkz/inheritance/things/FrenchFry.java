package com.xworkz.inheritance.things;

public class FrenchFry {

	public String name;
	public int price;
	public String ingredient;
	public String type;
	public boolean isFastFood;
	public String otherName;
	public String category;
	public String chef;
	public int chefSalary;
	public String chefForm;
	 
	public FrenchFry() {
	 	System.out.println("without argument Frenchfries running");
	    }
	 
	public FrenchFry(String ref) {
	 	name=ref;
	    }
	public FrenchFry(int ref, String ref1) {
	 	price=ref;
	 	ingredient=ref1;
	    }
	public FrenchFry(String ref, boolean ref1) {
	 	type=ref;
	 	isFastFood=ref1;
	    }
	public FrenchFry(String ref, String ref1, String ref2) {
	    name=ref1;
	    otherName=ref2;
	    category=ref2;
	    }
	public FrenchFry(String ref, String ref1,int ref2) {
		name=ref;
		chef=ref1;
		chefSalary=ref2;
	    }
	public FrenchFry(String ref, int ref1, boolean ref2) {
		type=ref;
		isFastFood=ref2;
		chefSalary=ref1;
	    }
	public FrenchFry(String ref, int ref1, int ref2 ) {
		chef=ref;
		chefSalary=ref2;
		price=ref2;
		}
	public FrenchFry(boolean ref, String ref1, String ref2) {
		isFastFood=ref;
		name=ref2;
		chefForm=ref1;
	}
	
	public void show() {
	System.out.println("New FrenchFries Running");
	System.out.println(name);
	System.out.println(price);
	System.out.println(ingredient);
	System.out.println(type);
	System.out.println(isFastFood);
	System.out.println(otherName);
	System.out.println(category);
	System.out.println(category);
	System.out.println(chefSalary);
	System.out.println(chefForm);
	
	
	System.out.println("----------------------------");
	}
	
	 
}    