package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

import java.util.Random;

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
				+ "an equaly old stone hallway, with an antique pully system lining the walls.");
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
		int i = 0;
//Code
		Random ran1 = new Random(2);
		//ran1 += 10;
		Random ran2 = new Random(2);
		Random ran3 = new Random(2);
		Random ran4 = new Random(2);
//Traps
		Random trapRow = new Random(3);
		Random trapCol = new Random(2);
	//
//Other V
		String trapDoorS = "NULL";
		int trapDoor = 0;
		//
		while(i == 0) {
		int iTrap = 0;
		while(iTrap == 0) {
			trapDoorS = JOptionPane.showInputDialog("There are 12 trap doors in totel.\n"
				+ "[ENTER THE TRAP DOOR NUMBER TO OPPEN IT]\n"
				+ "____________________\n"
				+ "|[10]-[20]-[30]-[40]|\n"
				+ "|[-[-[-[-----]-]-]-]|\n"
				+ "|[11]-[21]-[31]-[41]|\n"
				+ "|[-[-[-[-----]-]-]-]|\n"
				+ "|[12]-[22]-[32]-[42]|\n"
				+ "|___________________|");
			switch(trapDoorS) {
			case "10":
				iTrap += 1;
			case "20":
				iTrap += 1;
			case "30":
				iTrap += 1;
			case "40":
				iTrap += 1;
			case "11":
				iTrap += 1;
			case "21":
				iTrap += 1;
			case "31":
				iTrap += 1;
			case "41":
				iTrap += 1;
			case "12":
				iTrap += 1;
			case "22":
				iTrap += 1;
			case "32":
				iTrap += 1;
			case "42":
				iTrap += 1;
			default:
				JOptionPane.showMessageDialog(null, "Please enter a number that is on one of the trap doors.");
			}
		}
		trapDoor = Integer.parseInt(trapDoorS);
		//if(ran1 == trapDoor);
	}
		return(trapDoor);
	}
}

















