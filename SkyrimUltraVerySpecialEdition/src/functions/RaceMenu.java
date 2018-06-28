package functions;

import controllz.Basic;
import data.Pictures;

public class RaceMenu extends Basic{
	
	private static String[] character = new String[3];
	private static String raceOptions = "Choose your race \n 1.HighElve, 2.Argonian, 3.WoodElve, 4.Breton, 5.DarkElve, 6.Imperial, 7.Khajiit, 8.Nord, 9.Orc, 10.Redguard \n Write the first letter of the Race to choose it.";
	private static String[][] races = {
			{"HighElve",getStringFromText("HighElve")},
			{"Argonian",getStringFromText("Argonian")},
			{"WoodElve",getStringFromText("WoodElve")},
			{"Breton",getStringFromText("Breton")},
			{"DarkElve",getStringFromText("DarkElve")},
			{"Imperial",getStringFromText("Imperial")},
			{"Khajiit",getStringFromText("Khajiit")},
			{"Nord",getStringFromText("Nord")},
			{"Orc",getStringFromText("Orc")},
			{"Redguard",getStringFromText("Redguard")},
			
			
	};
	/* Creates a dialog in which the player can choose his gender, race and name
	 * The informations about the player are returned in a String[]
	 * 0 = gender
	 * 1 = Race
	 * 2 = Name
	 */
	public static String[] createCharacter() {
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
			showRace(raceInput, character[0]);
			if (raceInput < 10 && raceInput >= 0) { 
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
	private static void showRace(int raceID, String gender) {
		Pictures p = new Pictures();
		switch (raceID) {
		case 0:	if (gender.equals("m")) output(p.getAltmerM(),1);
				else output(p.getAltmerF(),1);
				character[1] = "HighElve";
				output(races[raceID][1],1);
			break;
		case 1: if (gender.equals("m")) output(p.getArgonianM(),1);
				else output(p.getArgonianF(),1);
				character[1] = "Argonian";
				output(races[raceID][1],1);
			break;
		case 2: if (gender.equals("m")) output(p.getBosmerM(),1);
				else output(p.getBosmerF(),1);
				character[1] = "WoodElve";
				output(races[raceID][1],1);
			break;
		case 3: if (gender.equals("m")) output(p.getBretonM(),1);
				else output(p.getBretonF(),1);
				character[1] = "Breton";
				output(races[raceID][1],1);
			break;
		case 4: if (gender.equals("m")) output(p.getDunmerM(),1);
				else output(p.getDunmerF(),1);
				character[1] = "DarkElve";
				output(races[raceID][1],1);
			break;
		case 5: if (gender.equals("m")) output(p.getImperialM(),1);
				else output(p.getImperialF(),1);
				character[1] = "Imperial";
				output(races[raceID][1],1);
			break;
		case 6: if (gender.equals("m")) output(p.getKhajiitM(),1);
				else output(p.getKhajiitF(),1);
				character[1] = "Khajiit";
				output(races[raceID][1],1);
			break;
		case 7: if (gender.equals("m")) output(p.getNordM(),1);
				else output(p.getNordF(),1);
				character[1] = "Nord";
				output(races[raceID][1],1);
			break;
		case 8: if (gender.equals("m")) output(p.getOrcM(),1);
				else output(p.getOrcF(),1);
				character[1] = "Orc";
				output(races[raceID][1],1);
			break;
		case 9: if (gender.equals("m")) output(p.getRedguardM(),1);
				else output(p.getRedguardF(),1);
				character[1] = "Redguard";
				output(races[raceID][1],1);
			break;
		}
	}
	
	
	
}
