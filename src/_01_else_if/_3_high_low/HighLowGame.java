
package _01_else_if._3_high_low;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int star = new Random().nextInt(100)+1;
		System.out.println(star);
		
		int guessNum = 12;
		
		while(guessNum > 0) {
			String guessS = JOptionPane.showInputDialog("Guess a number between 1 and 100.\n" + "[NUMBER OF GUESSES LEFT:" + guessNum + "]");
			int guess = Integer.parseInt(guessS);
			
			if(guess == star) {
				JOptionPane.showMessageDialog(null, "Congragulations! You won the Star affter only " + guessNum + " atempts!\n");
				System.exit(0);
			}
			else if(guess > star && guess <= 100) {
				JOptionPane.showMessageDialog(null, "You're to high...");
			}
			else if(guess < star && guess >= 1) {
				JOptionPane.showMessageDialog(null, "You're to low...");
			}
			else {
				JOptionPane.showMessageDialog(null, "Nice try, but you need to actchaly guess between 1 and 100 (incleding 1 and 100).");
				guessNum -= 1;
			}
			guessNum -= 1;
		}
		
		JOptionPane.showMessageDialog(null, "It looks like you have run out of atempts. Well, nice knowing ya!");
		// 2. Print out the random variable above
		
		// 11. Repeat steps 1 to 10 ten times
		
			// 1. Ask the user for a guess using a pop-up window, and save their response 

			// 4. Convert the users’ answer to an int (Integer.parseInt(string))
			
			// 5. if the guess is correct
				// 6. Win
				// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer.
			// 7. if the guess is high
				// 8. Tell them it's too high
			// 9. if the guess is low
				// 10. Tell them it's too low

		// 13. Tell them they lose
		
	}

}


