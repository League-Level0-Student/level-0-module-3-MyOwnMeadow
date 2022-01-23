package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;
public class The_House {
	
	static void main(String[]args) {
		
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
		
//Hall 1
		String hallDoor = "null";
		int iHall = 0;
		while(iHall == 0) {
			hallDoor = JOptionPane.showInputDialog(null, "The hallway is dimly lit by glowing stones inside of\n"
				+ "(now redundent) withering oil lamps. Their are 4 doors, 2 on the left wall, and 2 on the right.\n"
				+ "[PICK A DOOR]\n"
				+ "  ____________\n"
				+ " |__	 [?]   __|\n"
				+ " [L2]_[_]_[R2]\n"
				+ " ['']	 ['']\n"
				+ " [__]	 [__]\n"
				+ " |           |\n"
				+ " |__	      __|\n"
				+ " [L1]	 [R1]\n"
				+ " ['']	 ['']\n"
				+ " [__]	 [__]\n"
				+ " |           |\n"
				+ "	|___[YOU]___|");
			if(hallDoor.equalsIgnoreCase("L1") || hallDoor.equalsIgnoreCase("L2") || hallDoor.equalsIgnoreCase("R1") || hallDoor.equalsIgnoreCase("R2")) {
				iHall += 1;
			}
		}
		
		//Tank
		//   _Q_
		//	/(@)\
		// <<<^>>>
	}
	static void hall1() {
		String hallDoor = "null";
		int iHall = 0;
		while(iHall == 0) {
			hallDoor = JOptionPane.showInputDialog(null, "The hallway is dimly lit by glowing stones inside of\n"
				+ "(now redundent) withering oil lamps. Their are 4 doors, 2 on the left wall, and 2 on the right.\n"
				+ "[PICK A DOOR]\n"
				+ "  ____________\n"
				+ " |__	 [?]   __|\n"
				+ " [L2]_[_]_[R2]\n"
				+ " ['']	 ['']\n"
				+ " [__]	 [__]\n"
				+ " |           |\n"
				+ " |__	      __|\n"
				+ " [L1]	 [R1]\n"
				+ " ['']	 ['']\n"
				+ " [__]	 [__]\n"
				+ " |           |\n"
				+ "	|___[YOU]___|");
			if(hallDoor.equalsIgnoreCase("L1") || hallDoor.equalsIgnoreCase("L2") || hallDoor.equalsIgnoreCase("R1") || hallDoor.equalsIgnoreCase("R2") || hallDoor.equals("?")) {
				iHall += 1;
			}
			else {
				JOptionPane.showMessageDialog(null, "That is not an option...");
			}
		}
	}
}
