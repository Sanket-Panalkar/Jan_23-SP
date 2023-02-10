package com.xworkz.inheritance.things;

public class Camera {

	public String name;
    public int pix;
    public int cameras ;
    
    public void init(String name, int pix, int cameras) {
    	
    	this.name=name;
    	this.pix=pix;
    	this.cameras=cameras; 
    }
    
    public void displayCam() {
    	System.out.println("Camera method running....");
    	
        System.out.println("camera name :"+name);
        System.out.println("camera pixels:"+pix);
        System.out.println("number of cameras :"+cameras);
    }
}
