
package _02_loop_variables._3_robot_walk_of_fame;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot starbert = new Robot();
		starbert.setWindowSize(520, 200);
		starbert.penDown();
		starbert.setPenColor(Color.YELLOW);
		starbert.setPenWidth(2);
		starbert.setAngle(90);
		starbert.setSpeed(100);
		starbert.hide();
		// 1. Set the X position of the robot so that it starts on the left. 
		// You also need to show the robot to see the result of this line.
		starbert.setX(20);
		starbert.setY(100);
		String numOfStars = JOptionPane.showInputDialog("How meny stars do you want? [ENTER NUMBERS ONLY]");
		int starNum = Integer.parseInt(numOfStars);
		
		for(int i = 0; i < starNum; i++) {
			for(int i2 = 0; i2 < 5; i2++) {
				starbert.move(30);
				starbert.turn(144);
			}
			starbert.setAngle(90);
			starbert.penUp();
			starbert.move(50);
			starbert.penDown();
		}
		// 2. Make the robot draw a star shape. Hint: angle=144.

		// 3. Set the length of each line in the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of 10 stars (see recipe to see how it should look)
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}
