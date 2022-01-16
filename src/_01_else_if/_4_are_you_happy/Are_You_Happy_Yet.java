package _01_else_if._4_are_you_happy;

import java.util.Random;

import javax.swing.JOptionPane;

public class Are_You_Happy_Yet {
	
	public static void main(String[]args) {
		
		String ancer = JOptionPane.showInputDialog("Are you happy right now? [YES OR NO ANCERS ONLY!]");
	
		if(ancer.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "Keep on being you.");
		}
		else if(ancer.equalsIgnoreCase("no")) {
			String ancer1 = JOptionPane.showInputDialog("Do you want to be happy?");
			if(ancer1.equalsIgnoreCase("yes")) {
				JOptionPane.showMessageDialog(null, "Change something in your life. Go for a walk or a bike ride, talk to frinds, play games, what ever ushaly makes you happy.");				
			}
			else if(ancer1.equalsIgnoreCase("no")) {
				JOptionPane.showMessageDialog(null, "Are you sure? Well, I guess you can do what you want, but just know that everyone deserves to be happy, inclueding you.");
			}
			else {
				JOptionPane.showMessageDialog(null, "ERROR: #)#\n" + "R#@%IN% S^@%#MS>>>");
				System.exit(0);
			}
		}
	}
}
