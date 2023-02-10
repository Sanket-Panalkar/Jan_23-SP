package com.xworkz.assosiation.things;

public class Security {

	public String deptName;
	public int totalStaff;
	public int headStaff;
	public Company company;
	
	public Security() {
		System.out.println("No-arg constructor of Security...\n");
	}
	public void setDeptName(String deptName) {
		this.deptName=deptName;
	}
	public void setTotalStaff(int totalStaff) {
		this.totalStaff=totalStaff;
	}
	public void setHeadStaff(int headStaff) {
		this.headStaff=headStaff;
	}

	
}
