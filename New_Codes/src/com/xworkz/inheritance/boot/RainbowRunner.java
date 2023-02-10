package com.xworkz.inheritance.boot;

import com.xworkz.eclipse.project.things.Rainbow;

public class RainbowRunner {

	public static void main(String[] args) {
		Rainbow r = new Rainbow("spectrum", 2.36f, "Circle", "india", "OpositToSun", 40.49d, 00.1d, 4.00f);
		r.display();
		Rainbow r1 = new Rainbow("Spwctrum", 2.35f, "Circle", "shrilanka", "opositto sun", 50.68d, 00.05, 6.00f);
		r1.display();
		
	}
}
