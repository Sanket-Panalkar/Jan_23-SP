package com.xworkz.inheritance.things;

public class Phone {

    public String brand;
    public double price;
    public String oS;
    public Camera cam = new Camera();
    
    public void init(String brand, double price, String oS) {
    	
    	this.brand=brand;
    	this.price=price;
    	this.oS=oS;
    }
    
    public void display() {
    	System.out.println("\n");
    	System.out.println("Phone method runnring...");
        System.out.println("mobile brand :"+brand);
        System.out.println("mobile price :"+price);
        System.out.println("mobile operating System :"+oS);
        
        System.out.println("\n");
        
        this.cam.displayCam();
        
        
    }
    
}
