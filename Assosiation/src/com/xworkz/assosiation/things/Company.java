package com.xworkz.assosiation.things;

public class Company {

	public String name;
	public String ceoName;
	public int since;
    public Country country;
    
    public Company() {
    	System.out.println("No-arg constructor of Company...\n");
    }
    public void setName(String name) {
    	this.name=name;
    }
    public void setceoNmae(String ceoName) {
    	this.ceoName=ceoName;
    }
    public void setSince(int since) {
    	this.since=since;
    }
    public void setCountry(Country country) {
    	this.country=country;
    }
    
    public void display() {
        System.out.println("siaplay method of Country---");
        System.out.println("Company Nmae :"+name);
        System.out.println("CEO Name :"+ ceoName);
        if(country!=null) {
        	this.country.display();
        }else {
        	System.out.println("country is not not pionting to any memory...");
        }
    }
    
}
