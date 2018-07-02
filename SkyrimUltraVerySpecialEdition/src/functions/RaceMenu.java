package functions;

import game.Basic;

public class RaceMenu extends Basic{
	
	private  String[] character = new String[3];
	private  String raceOptions = "Choose your race \n	1.HighElve, 2.Argonian, 3.WoodElve, 4.Breton, 5.DarkElve, 6.Imperial, 7.Khajiit, 8.Nord, 9.Orc, 10.Redguard \n Write the first letter of the Race to choose it.";
	private  String[] races = {"HighElve","Argonian","WoodElve","Breton","DarkElve","Imperial","Khajiit","Nord","Orc","Redguard"};
	/* Creates a dialog in which the player can choose his gender, race and name
	 * The informations about the player are returned in a String[]
	 * 0 = gender
	 * 1 = Race
	 * 2 = Name
	 */
	public  String[] createCharacter() {
		clear();
		output("Are you a man(m) or a woman(f)?");
		String i = input.next();
		while (!i.equals("f") && !i.equals("m")) {
			output("Are you a man(m) or a woman(f)?");
			i = input.next();
		}
		character[0] = i;
		
		while (true) {
			clear();
			output(raceOptions);
			int raceInput = getInt()-1;
			clear();
			if (raceInput < 10 && raceInput >= 0) { 
				showRace(raceInput, character[0]);
				output("Are you sure? (y/n)");
				if  (input.next().equals("y") ) {
					clear();
					output("What is your name prisoner?");
					character[2] = input.next();
					break;
				}
			}
		}
		return character;	
	}
	
	//Just shows a "picture" of the Race with a description and sets the Race in the character[]
	private  void showRace(int raceID, String gender) {
		output(getStringFromPicture("races/"+gender+"/"+races[raceID]),1);
		output(getStringFromText("racemenu/"+races[raceID]));
		character[1] = races[raceID];
	}
	
	
	
}
