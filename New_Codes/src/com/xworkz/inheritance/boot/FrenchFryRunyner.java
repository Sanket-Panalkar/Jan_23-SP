package com.xworkz.inheritance.boot;

import com.xworkz.eclipse.project.things.FrenchFry;

public class FrenchFryRunyner{

	public static void main(String[] args) {
		
		FrenchFry ref = new FrenchFry();
		ref.show();
		
		FrenchFry ref1 = new FrenchFry("FrenchFry");
		ref.show();
		
	    FrenchFry ref2 = new FrenchFry(130,"Oil,potato");
		ref2.show();
		
		FrenchFry ref4=new FrenchFry(55,"oil,potato");
		ref4.show();
		
		FrenchFry ref5=new FrenchFry("Fastfood",true);
		ref5.show();
		
		FrenchFry ref6=new FrenchFry("Freis","Tom",35000);
		ref6.show();
		
		FrenchFry ref7=new FrenchFry("FrenchFry","Fastfood",500);
		ref7.show();
		
		FrenchFry ref8=new FrenchFry();
		ref8.show();
		
		FrenchFry ref9=new FrenchFry(35000,"Raj");
		ref9.show();
		
		FrenchFry ref10=new FrenchFry();
		ref10.show();
		
		FrenchFry ref11=new FrenchFry("Rag","Dubai",35985);
		ref11.show();
		

	}

	}

