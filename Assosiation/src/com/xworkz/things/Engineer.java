package com.xworkz.things;

public class Engineer {

	public String name;
	public double salary;
	public String[] skills;
	public Degree[] degree;
	
	public Engineer() {
	
		System.out.println("no arg constructor of Engineer...");
	}
	
	public void setNam(String name) {
		this.name=name;
	}
	public void setSalary(double salary) {
		this.salary=salary;
	}
	public void setSkills(String[] skills) {
		this.skills=skills;
	}
	public void setDegree(Degree[] degree) {
		this.degree=degree;
	}
	
	
	public void display() {
		System.out.println("display method of Engineer");
		System.out.println("name :"+this.name);
		System.out.println("salary :"+this.salary);
		if(skills != null) {
			for(int seq=0; seq<this.skills.length; seq++) {
				String element = this.skills[seq];
                     System.out.println("skill :"+element+"at index :"+seq);
			}else {
				System.err.println("this.skills is not pointing to any memory...");
			}
		}
	}
	
	
 }


