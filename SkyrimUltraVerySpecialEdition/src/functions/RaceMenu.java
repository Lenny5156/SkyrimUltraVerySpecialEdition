package functions;

import game.Basic;

public class RaceMenu {

	private String[] character = new String[3];
	private String raceOptions = "Choose your race \n	1.HighElve, 2.Argonian, 3.WoodElve, 4.Breton, 5.DarkElve, 6.Imperial, 7.Khajiit, 8.Nord, 9.Orc, 10.Redguard \n Write the number of the Race to choose it.";
	private String[] races = { "HighElve", "Argonian", "WoodElve", "Breton", "DarkElve", "Imperial", "Khajiit", "Nord",
			"Orc", "Redguard" };

	/*
	 * Creates a dialog in which the player can choose his gender, race and name The
	 * informations about the player are returned in a String[] 
	 * 0 = gender 
	 * 1 = Race
	 * 2 = Name
	 */
	public String[] createCharacter() {
		Basic.clear();
		Basic.output("Are you a man(m) or a woman(f)?");
		String i = Basic.input.next();
		while (!i.equals("f") && !i.equals("m")) {
			Basic.output("Are you a man(m) or a woman(f)?");
			i = Basic.input.next();
		}
		character[0] = i;

		while (true) {
			Basic.clear();
			Basic.output(raceOptions);
			int raceInput = Basic.getInt() - 1;
			Basic.clear();
			if (raceInput < 10 && raceInput >= 0) {
				showRace(raceInput, character[0]);
				Basic.output("Are you sure? (y/n)");
				if (Basic.input.next().equals("y")) {
					Basic.clear();
					Basic.output("What is your name prisoner?");
					character[2] = Basic.input.next();
					break;
				}
			}
		}
		return character;
	}

	// Just shows a "picture" of the Race with a description and sets the Race in
	// the character[]
	private void showRace(int raceID, String gender) {
		Basic.output(Basic.getStringFromPicture("races/" + gender + "/" + races[raceID]), 1);
		Basic.output(Basic.getStringFromText("racemenu/" + races[raceID]));
		character[1] = races[raceID];
	}

}
