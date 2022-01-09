
package _01_else_if._2_crazy_cat_lady;

import java.net.URI;
import javax.swing.JOptionPane;

public class CrazyCatLady {
	public static void main(String[] args) {
		
		String catS = JOptionPane.showInputDialog(null, "How meny cats do you have? [PLEASE ANCER IN NUMBERS ONLY]!");
		int cat = Integer.parseInt(catS);
		
		if(cat > 3) {
			JOptionPane.showMessageDialog(null, "You're one of those crazy cat ladys!");
		}
		else if(cat <= 0) {
			JOptionPane.showMessageDialog(null, "...Ever seen a frog do this?");
			playVideo("https://www.youtube.com/watch?v=wqO93l1aPtk");
		}
		else {
			JOptionPane.showMessageDialog(null, "You know, they RELLY like lazers and boxes. Perhaps a little TOO much...");
			playVideo("https://www.youtube.com/watch?v=2QMeGkbdIVw");
		}
		
		// 1. Ask the user how many cats they have
		// 2. Convert their answer into an int
		// 3. If they have 3 or more cats, tell them they are a crazy cat lady
		// 4. If they have less than 3 cats AND more than 0 cats, call the method below to show them a cat video
		//    Hint: You can use the && operator 
		// 5. If they have 0 cats, show them a video of A Frog Sitting on a Bench Like a Human
		
		
		
		
		
		
	}

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

