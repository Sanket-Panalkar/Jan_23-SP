package com.xworkz.inheritance.things;

public class EngineerRunner {

	public static void main(String[] args) {
		Engineer engineer = new Engineer();
		engineer.setName("Sanket");
		engineer.setSalary(35000);
		
		String[] ref1 = {"core java", "html","sql"};
		engineer.setSkills(ref1);
		
		Degree degree = new Degree();
		degree.setName("BE");
		degree.setBranch("EC");
		degree.setSem(8);
		
		Degree degree1 = new Degree();
		degree1.setName("BE");
		degree1.setBranch("Mech");
		degree1.setSem(8);
	
		
		
		
		
	}
}
