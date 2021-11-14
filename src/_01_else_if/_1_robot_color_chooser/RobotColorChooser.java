
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		Robot robo = new Robot();
		int i = 0;
		robo.penDown();
		robo.setSpeed(100);
		
		while(true) {
			robo.setPenWidth(10);
			
			String n = JOptionPane.showInputDialog("What shape should Robo draw this time?\n" + "[PLEASE ENTER THE NUMBER OF SIDES]");
			String color = JOptionPane.showInputDialog("And with what color pen?");
			
			if(color.equalsIgnoreCase("red")) {
				robo.setPenColor(Color.red);
			}
			while(i < 50) {
				robo.move(100);
				robo.turn(89);
			
				i += 1;
			}
	
		
		
		
		
		}
		//1. Create a new Robot
	    //2. Make the robot draw a shape (this will take more than one line of code)		
		//3. Set the pen width to 10
		//4. Ask the user what color pen they would like the robot to draw with
		//5. Use an if/else statement to set the pen color that the user requested
        //6. If the user doesn't enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
	}
}
