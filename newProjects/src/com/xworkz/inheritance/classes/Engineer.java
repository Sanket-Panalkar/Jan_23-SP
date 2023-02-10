package com.xworkz.inheritance.classes;




	public class Engineer {

		public String name;
		public double salary;
		public String[] skills;
		public Degree[] degree;
		
		public Engineer() {
		
			System.out.println("no arg constructor of Engineer...");
		}
		
		public void setName(String name) {
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
			
		}
		
		
	 }


