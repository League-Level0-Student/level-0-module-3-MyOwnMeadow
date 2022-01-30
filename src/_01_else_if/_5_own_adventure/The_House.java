package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;
public class The_House {
	
	public static void main(String[]args) {
		int bossHP = 0;
		String wep = JOptionPane.showInputDialog(null, "You are a brave advencherer. You come appon a fortus hiddin deep within the Missty Forest.\n"
				+ "With you, you have 5 healing potions (a.k.a. Potion), 20ft of rope, a tourch, and your trusty...\n"
				+ "[CHOSE ONE:\n"
				+ "SWORD\n"
				+ "BOW\n"
				+ "DAGGER\n"
				+ "SPEAR\n"
				+ "SPELL BOOK\n]");
		JOptionPane.showMessageDialog(null, "Out of curiosity, you oppen the old, roting door to find\n"
				+ "an equaly old stone hallway, with an old pully system lining the walls.");
		while(bossHP == 0) {
			String hallDoor = hall1();
			if(hallDoor.equalsIgnoreCase("L1")) {
				//Trap door room (code)
			}
			else if(hallDoor.equalsIgnoreCase("L2")) {
				//Tank room (gear)
			}
			else if(hallDoor.equalsIgnoreCase("R1")) {
				//Locked
				JOptionPane.showMessageDialog(null, "It's locked. You can hear the clatering sound of pots and pans...");
			}
			else if(hallDoor.equalsIgnoreCase("R2")) {
				//Oger room (brick)
			}
			else {
				//Final staircase
			}
		}
		
		
		
		
		//Tank
		//   _Q_
		//	/(@)\
		// <<<^>>>
	}
	static String hall1() {
		String hallDoor = "null";
		int iHall = 0;
		while(iHall == 0) {
			hallDoor = JOptionPane.showInputDialog(null, "The hallway is dimly lit by glowing stones inside of\n"
				+ "(now redundent) withering oil lamps. Their are 4 doors, 2 on the left wall, and 2 on the right.\n"
				+ "[PICK A DOOR]\n"
				+ "|----[?]----|\n"
				+ "|[L2]---[R2]|\n"
				+ "|-----------|\n"
				+ "|[L1]---[R1]|\n");
				/*+ "  ____________\n"
				+ " |__''[?]''__|\n"
				+ " [L2]_[_]_[R2]\n"
				+ " [---]	 ['']\n"
				+ " [__]	 [__]\n"
				+ " |			|\n"
				+ " |__		  __|\n"
				+ " [L1]	 [R1]\n"
				+ " ['']	 ['']\n"
				+ " [__]	 [__]\n"
				+ " |			|\n"
				+ "	|___[YOU]___|");
				*/
			if(hallDoor.equalsIgnoreCase("L1") || hallDoor.equalsIgnoreCase("L2") || hallDoor.equalsIgnoreCase("R1") || hallDoor.equalsIgnoreCase("R2") || hallDoor.equals("?")) {
				iHall += 1;
			}
			else {
				JOptionPane.showMessageDialog(null, "That is not an option...");
			}
		}
		return hallDoor;
	}
	static int trapRoom() {
		int iTrap = 0;
		while(iTrap == 0) {
			String trapDoor = JOptionPane.showInputDialog("There are 12 trap doors in totel.\n"
				+ "[CHOSE A TRAP DOOR TO OPPEN]\n"
				+ "____________________\n"
				+ "|[1a]-[2a]-[3a]-[4a]|\n"
				+ "|[-[-[-[-----]-]-]-]|\n"
				+ "|[1b]-[2b]-[3b]-[4b]|\n"
				+ "|[-[-[-[-----]-]-]-]|\n"
				+ "|[1c]-[2c]-[3c]-[4c]|\n"
				+ "|___________________|");
			iTrap += 1;
		}
		return iTrap;
	}
}
