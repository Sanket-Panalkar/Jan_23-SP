package com.xworkz.inheritance.boot;

import com.xworkz.eclipse.project.things.Movie;

public class MovieRunner {

	public static void main(String[] args) {
		Movie m = new Movie();
		m.display();

		Movie m1 = new Movie();
		m1.init("KGF", 2023, "prashath neel", "Yesh","2.8 hrs", "Action");
		m1.display(); 

		Movie m2= new Movie();
		m2.init("kantara", 2025, "rishabh Shetty", "rushabh Setty","2.5 hrs", "Action");
		m2.display();

		Movie m3= new Movie();
		m3.init("Avatara", 2026, "Jams Camron", "Zoe Saldana","3.00 hrs", "Action");
		m3.display();

		Movie m4= new Movie();
		m4.init("Krish4", 2030, "rajamouli", "SRK","5.00 hrs", "love");
		m4.display();

		Movie m5= new Movie();
		m5.init("a day in java", 2055, "Jams Gousling", "jdk","30 days", "horror");
		m5.display();
	}
}
