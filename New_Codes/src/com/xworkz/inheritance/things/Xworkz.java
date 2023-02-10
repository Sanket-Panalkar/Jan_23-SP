package com.xworkz.inheritance.things;

public class Xworkz {

	public int trainee;
	public  String founder;
	public boolean python;
	public Trainer tr = new Trainer();
	
	public void init(int trainee, String founder, boolean python) {
		
		this.trainee=trainee;
		this.founder=founder;
		this.python=python;
	}
	
	public void display() {
		System.out.println("Xworkx method running....");
		System.out.println("number of trainee's :" + trainee );
		System.out.println("founder Name :" + founder );
		System.out.println("trainee's learns python :" + python );
		
		this.tr.displayTrainer();
	}
}
