package com.xworkz.inheritance.things;

public class Degree {

	public String name;
	public String branch;
	public int sem;
	public double percentage;
	
	
	public Degree() {
		System.out.println("default constructor of Degree..");
		
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setbranch(String branch) {
		this.branch=branch;
	}
	public void setsem(int sem) {
		this.sem=sem;
	}
	public void percentage(double percentage) {
		this.percentage=percentage;
	}
	
	public void display() {
		
		System.out.println("display method of Degree...");
		
		System.out.println("name :"+this.name);
		System.out.println("branch :"+this.branch);
		System.out.println("sem :"+this.sem);
		System.out.println();
	}
	
}
