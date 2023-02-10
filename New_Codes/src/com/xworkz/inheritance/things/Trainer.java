package com.xworkz.inheritance.things;

public class Trainer {

	public int trainers;
	public String topic;
	public boolean offline;
	
    public void init(int trainers, String topic, boolean offline) {
		
		this.trainers=trainers;
		this.topic=topic;
		this.offline=offline;
	}
	
	public void displayTrainer() {
		System.out.println("\n");
		System.out.println("Trainer method running....");
		System.out.println("number of trainers :" + trainers );
		System.out.println("trainers teaches language :" + topic );
		System.out.println("takes class in offline :" + offline );
		
	}
}

