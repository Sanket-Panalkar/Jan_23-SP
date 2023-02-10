package com.xworkz.inheritance.things;

public class God {

	public String name;
	public String job;
	public String symbol;

	public void init(String name, String job, String symbol) {
		this.name = name;
		this.job = job;
		this.symbol = symbol;
	}

	public void displayGod() {
		System.out.println("\n");
		System.out.println("God Method Running....");
		System.out.println("God Name :"+name);
		System.out.println("God job :"+job);
		System.out.println("God symbol :"+symbol);
}
}
