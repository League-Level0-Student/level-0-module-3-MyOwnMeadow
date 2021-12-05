package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		Robot robo = new Robot();
		robo.penDown();
		robo.setSpeed(200);
		
		while(true) {
			robo.setPenWidth(5);
			
			int rainbow = 0;
			int crazy = 0;
			
			String nS = JOptionPane.showInputDialog("What shape should Robo draw this time?\n" + "[PLEASE ENTER THE NUMBER OF SIDES]");
			String color = JOptionPane.showInputDialog("And with what color pen?");
			
			int n = 0;
			
			if(nS.equals("")) {
				n = 3;
			}
			else if(nS.equals("1")) {
				n = 3;
			}
			else {
				n = Integer.parseInt(nS);
			}
			
			if(color.equalsIgnoreCase("red")) {
				robo.setPenColor(Color.red);
			}
			else if(color.equalsIgnoreCase("blue")) {
				robo.setPenColor(Color.red);
			}
			else if(color.equalsIgnoreCase("orange")) {
				robo.setPenColor(Color.orange);
			}
			else if(color.equalsIgnoreCase("green")) {
				robo.setPenColor(Color.green);
			}
			else if(color.equalsIgnoreCase("yellow")) {
				robo.setPenColor(Color.yellow);
			}
			else if(color.equalsIgnoreCase("black")) {
				robo.setPenColor(Color.black);
			}
			else if(color.equalsIgnoreCase("white")) {
				robo.setPenColor(Color.white); 
			}
			else if(color.equalsIgnoreCase("gray")) {
				robo.setPenColor(Color.gray); 
			}
			else if(color.equalsIgnoreCase("cyan")) {
				robo.setPenColor(Color.cyan);
			}
			else if(color.equalsIgnoreCase("teal")) {
				robo.setPenColor(Color.cyan);
			}
			else if(color.equalsIgnoreCase("magenta")) {
				robo.setPenColor(Color.magenta);
			}
			else if(color.equalsIgnoreCase("")) {
				robo.setRandomPenColor();
			}
			else if(color.equalsIgnoreCase("rainbow")) {
				robo.setPenColor(Color.red);
				rainbow = 2;
			}
			else if(color.equalsIgnoreCase("crazy")) {
				robo.setRandomPenColor();
				crazy += 1;
			}
			else {
				JOptionPane.showMessageDialog(null, "Sorry, we don't have that color."
						+ "[LIST OF COLORS:\n"
						+ "RED\n"
						+ "BLUE\n"
						+ "ORANGE\n"
						+ "YELLOW\n"
						+ "GREEN\n"
						+ "CYAN\n"
						+ "TEAL\n"
						+ "MAGENTA\n"
						+ "BLACK\n"
						+ "WHITE\n"
						+ "AND GRAY.\n"
						+ "ENTER NOTHING FOR A RANDOM CHOISE].");
			}
			int i = 0;
			while(i < (180/n)+n) {
				robo.move(100);
				robo.turn(180-(((n-2)*180)/n)-1);
				
				if(crazy > 0) {
					robo.setRandomPenColor();
				}
				if(rainbow == 1) {
					robo.setPenColor(Color.red);
				}
				else if(rainbow == 2) {
					robo.setPenColor(Color.orange);
				}
				else if(rainbow == 3) {
					robo.setPenColor(Color.yellow);
				}
				else if(rainbow == 4) {
					robo.setPenColor(Color.green);
				}
				else if(rainbow == 5) {
					robo.setPenColor(Color.cyan);
				}
				else if(rainbow == 6) {
					robo.setPenColor(Color.blue);
				}
				else if(rainbow == 7) {
					robo.setPenColor(Color.magenta);
				}
				if(rainbow >= 8) {
					rainbow = 1;
				}
				else if(rainbow > 0) {
					rainbow += 1;
				}
				i += 1;
			}
			i = 0;
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
