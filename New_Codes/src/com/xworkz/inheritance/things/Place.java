package com.xworkz.inheritance.things;

public class Place {

	public String name;
	public long population;
	public String dist;
	public String state;
	public String country;
	
	public Place() {
		System.out.println("constructor without arguments");
	}
   public Place(String name) {
	   this.name=name;
	   
	}
   public Place(String name, long population) {
	   this(name);
	   this.population=population;
    }
   public Place(String name, long population, String dist) {
	   this(name,population);
	   this.dist=dist;	    
    }
   public Place(String name, long population, String dist, String state,String country) {
	   this(name,population,dist);
	   this.state=state;
    }
   
   public void value(String r1, long r2,String r3,String r4,String r5 ) {
	   System.out.println("initiaizing of Place");
	   name=r1;
	   population=r2;
	   dist=r3;
	   state=r4;
	   country=r5;
    }
   public void display() {
	   System.out.println("display method running....\n");
	   System.out.println("name :"+name);
	   System.out.println("population :"+population);
	   System.out.println("dist :"+dist);
	   System.out.println("state :"+state);
	   System.out.println("country :"+country);
   }
}