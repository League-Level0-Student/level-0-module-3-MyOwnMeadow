
package _01_else_if._3_high_low;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int star = new Random().nextInt(100)+1;
		System.out.println(star);
		
		int guessNum = 12;
		int gH = 1000;
		int gL = 0;
		int cGuess = 1000;
		
		while(guessNum > 0) {
			String guessS = JOptionPane.showInputDialog("Guess a number between 1 and 100.\n" + "[NUMBER OF GUESSES LEFT:" + guessNum + "]");
			int guess = Integer.parseInt(guessS);
			
			if(guess == star) {
				JOptionPane.showMessageDialog(null, "Congragulations! You won the Star affter only " + (12-guessNum) + " atempts!\n");
				System.exit(0);
			}
			else if(guess > star && guess <= 100) {
				JOptionPane.showMessageDialog(null, "You're to high...");
				if((guess - star) < (gH - star)) {
					gH = guess;
					System.out.println("gH = " + gH);
				}
			}
			else if(guess < star && guess >= 1) {
				JOptionPane.showMessageDialog(null, "You're to low...");
				if((star - guess) < (star - gL)) {
					gL = guess;
					System.out.println("gL = " + gL);
				}
			}
			else {
				JOptionPane.showMessageDialog(null, "Nice try, but you need to actchaly guess between 1 and 100 (incleding 1 and 100).");
				guessNum -= 1;
			}
			guessNum -= 1;
		}

		if((gH - star) < (star - gL)) {
			cGuess = gH;
		}
		else if((star - gL) < (gH - star)) {
			cGuess = gL;
		}
		JOptionPane.showMessageDialog(null, "It looks like you have run out of atempts. Well, it was nice knowing you.\n" + "\n" + "\n"
				+ "[CLOSEST ATTEMPT: " + cGuess + "]\n"
				+ "[TARGER NUMBER: " + star + "]");
		System.exit(0);
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


