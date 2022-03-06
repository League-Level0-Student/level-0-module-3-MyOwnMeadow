package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

import java.util.Random;

public class The_House {
	
//Door code
	static Random ran = new Random();
	static int ran1 = ran.nextInt(3);
	static int ran2 = ran.nextInt(3);
	static int ran3 = ran.nextInt(3);
	static int ran4 = ran.nextInt(3);
	
	public static void main(String[]args) {
	//Printing for debug
		System.out.println("ran1");
		System.out.println("ran2");
		System.out.println("ran3");
		System.out.println("ran4");
	//Colectibles
		String key = "don't have a key...";
	//=============================
		
		int bossHP = 0;
		String wep = JOptionPane.showInputDialog(null, "You are a brave advencherer. Durring a walk, you stumble stumble across an old town hiddin deep within the forest. Only one building seems to be standing.\n"
				+ "With you, you have 5 healing potions (a.k.a. Potion), 20ft of rope, an oil lantern, and your trusty...\n"
				+ "[CHOSE ONE:\n"
				+ "SWORD\n"
				+ "BOW\n"
				+ "DAGGER\n"
				+ "SPEAR\n"
				+ "SPELL BOOK\n]");
		JOptionPane.showMessageDialog(null, "Out of curiosity, you oppen the old, rusting door to find\n"
				+ "an equaly old hallway, with an antique pully system lining the walls.\n"
				+ "The Pully system seems to once have aided in the transportation of some sort of entry fee,\n"
				+ "which could of been colected at the rotating gates posishend right at the entrence of the hallway.");
		while(bossHP == 0) {
			String hallDoor = hall1();
			if(hallDoor.equalsIgnoreCase("L1")) {
				trapRoom(); //Code
			}
			else if(hallDoor.equalsIgnoreCase("L2")) {
				//Maintnence room (gear/enconter)
			}
			else if(hallDoor.equalsIgnoreCase("R1")) {
				//Locked
				JOptionPane.showMessageDialog(null, "It's locked. You can hear the clatering sound of pots and pans inside...");
			}
			else if(hallDoor.equalsIgnoreCase("R2")) {
				//Oger(?) room (number square and bones brick)
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
				+ "(now redundent) withering oil lamps, also with their own pully system.\n"
				+ " Their are 4 doors, 2 on the left wall, and 2 on the right.\n"
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
	static void trapRoom() {
		int i = 0;
//Traps
		int trapRow = ran.nextInt(3)+1;
		int trapCol = ran.nextInt(4)+1;
	//
//Other V
		String trapDoorS = "NULL";
		int trapDoor = 0;
		//
		while(i == 0) {
		int iTrap = 0;
		while(iTrap == 0) {
			trapDoorS = JOptionPane.showInputDialog("There are 12 trap doors in totel.\n"
				+ "[ENTER THE TRAP DOOR NUMBER TO OPPEN IT - ENTER ''0'' TO EXIT ROOM]\n"
				+ "____________________\n"
				+ "|[10]-[20]-[30]-[40]|\n"
				+ "|[-[-[-[-----]-]-]-]|\n"
				+ "|[11]-[21]-[31]-[41]|\n"
				+ "|[-[-[-[-----]-]-]-]|\n"
				+ "|[12]-[22]-[32]-[42]|\n"
				+ "|___________________|");
			switch(trapDoorS) {
			case "0":
				iTrap += 1;
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
		if(trapDoor == 0) {
			JOptionPane.showMessageDialog(null, "You exit the room.");
		}
		else if(ran1 == trapDoor - 10) {
			JOptionPane.showMessageDialog(null, "Climing down, you see what seems to be a recked hideout, the type that you made when you were a kid.\n"
					+ "This one seems to be much older.\n"
					+ "You spot some writing on the wall, writen in child's handwriting\n"
					+ "with some sort of driping paint(?) It reads:\n" + "\n"
					+ "We have been stuck here,\n"
					+ "For over a year.\n"
					+ "We all live in fear,\n"
					+ "For they are near.");
			JOptionPane.showMessageDialog(null, "You feel creeped out. You clime back up.");
			JOptionPane.showMessageDialog(null,"While climing, you relise that the underside of the trap door had an ''X'' burned into it.");
		}
		else if(ran2 == trapDoor - 20) {
			JOptionPane.showMessageDialog(null, "Climing down, you enter what seems to be a pantry.\n"
					+ "You spot some small writing on the wall. It seems to be old... It reads:\n" + "\n"
					+ "Why do we have an entire room dedicated to pickles agin?\n" + "\n"
					+ "All over the room, you find simaler writing. It seems to be writen by some former staff of this bulding. The pickel text even has others comenting on it:\n" + "\n"
					+ "Because pickles are the only thing we can store here.\n"
					+ "Why can't we store other preservetives here? isn't that what this place is for?\n"
					+ "If we store anything else here, you know that SHE will find it. We don't want to have to lock up another room. She has already found a difrent way into the kitchen!\n"
					+ "Why do we even have pickles at all?");
			
			JOptionPane.showMessageDialog(null, "...");
			JOptionPane.showMessageDialog(null, "The pickles are already gon. Some one else ate them.\n"
					+ "Feeling disapointed, you clime back up.");
			JOptionPane.showMessageDialog(null,"While climing, you relise that the underside of the trap door had an ''X'' burned into it.");
		}
		else if(ran3 == trapDoor - 30) {
			JOptionPane.showMessageDialog(null, "You clime down the rusty lader, into the obyss below...\n"
					+ "You find a decaying, but well-furnished room. It seems to be an ofice...? Who would want to work down Here?\n"
					+ "A neon red stickynote caches your eye. It is writen in overly fancy, hard to read cursive. From what you can tell, it reads:\n" + "\n"
							+ "Please change the system for generating the code for the V.I.P. stage. It only outputs 0, 1, and 2, and we don't want our custemerst to go there only to find out that some teen spray painted the [the next word is to fancy to be legible]. ");
			JOptionPane.showMessageDialog(null, "You dout that the code has been changed recently. But you wonder where this stage could be?\n"
					+ "The only stage you know of is back up the lader in the dining area, and that was not protected by any sort of lock. And what could be on the stage?\n"
					+ "Feeling annoyed at the over-the-top cursive, you clime back up the lader.");
			JOptionPane.showMessageDialog(null, "You notise a cursive ''X'' burnd into the underside of the trap door. it acors to you that maybe there is a reasen for the trapdoors being numbered the way they are...");
		}
		else if(ran4 == trapDoor - 40) {
			JOptionPane.showMessageDialog(null, "You clime down the later, and enter what appers to be a stroge room for party suplies.\n"
					+ "The only notable thing, other then the noise makers, is a key on the ground. It is labled:\n" + "\n"
					+ "BACK UP SECURITY - USE IN ADDITION TO COMBO LOCK\n" + "\n"
					+ "Good thing you found this key!\n"
					+ "[KEY ADDED TO INVATORY].");
//ADD KEY
		}
		else if(trapRow + trapCol == trapDoor) {
			//Encounter
		}
		else {
			//Other storge room
		}
	}
	}
}

















