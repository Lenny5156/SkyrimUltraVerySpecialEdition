package functions;

import controllz.Basic;
import data.Pictures;

public class RaceMenu extends Basic{
	
	private String[] character = new String[3];
	private String raceOptions = "Choose your race \n 1.HighElve, 2.Argonian, 3.WoodElve, 4.Breton, 5.DarkElve, 6.Imperial, 7.Khajiit, 8.Nord, 9.Orc, 10.Redguard \n Write the first letter of the Race to choose it.";
	
	/* Creates a dialog in which the player can choose his gender, race and name
	 * The informations about the player are returned in a String[]
	 * 0 = gender
	 * 1 = Race
	 * 2 = Name
	 */
	public String[] createCharacter() {
		clear();
		output("Are you a man(m) or a Woman(w)?");
		String i = input.next();
		while (!i.equals("w") && !i.equals("m")) {
			output("Are you a man(m) or a woman(w)?");
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
	private void showRace(int raceID, String gender) {
		Pictures p = new Pictures();
		switch (raceID) {
		case 0:	if (gender.equals("m")) output(p.getAltmerM(),1);
				else output(p.getAltmerF(),1);
				character[1] = "HighElve";
				output("Also known as \"Altmer\" in their homeland of Summerset Isle, the high \nelves are the most strongly gifted in the arcane arts of all the races. \nThey can call upon their Highborn power to regenerate Magicka \nquickly.",1);
			break;
		case 1: if (gender.equals("m")) output(p.getArgonianM(),1);
				else output(p.getArgonianF(),1);
				character[1] = "Argonian";
				output("This reptilian race, well-suited for the treacherous swamps of their \nBlack Marsh homeland, has developed a natural resistance to diseases \nand the ability to breath underwater. They can call upon the Histskin \nto regenerate health very quickly.",1);
			break;
		case 2: if (gender.equals("m")) output(p.getBosmerM(),1);
				else output(p.getBosmerF(),1);
				character[1] = "WoodElve";
				output("The clanfolk of the Western Valenwood forests, also known as \n\"Bosmer.\" Wood elves make good scouts and thieves, and there are \nno finer archers in all of Tamriel. They have natural resistance to \nboth poisons and diseases. They can Command Animals to fight for \n them.",1);
			break;
		case 3: if (gender.equals("m")) output(p.getBretonM(),1);
				else output(p.getBretonF(),1);
				character[1] = "Breton";
				output("In addition to their quick and perceptive grasp of spellcraft, even the \nhumbles of High Rock's Bretons can boast a resistance to magic \nBretons can call upon the Dragonsin power to absorb spells.",1);
			break;
		case 4: if (gender.equals("m")) output(p.getDunmerM(),1);
				else output(p.getDunmerF(),1);
				character[1] = "DarkElve";
				output("Also known as \"Dunmer\" in their homeland of Morrowind, drk elves \n are noted for their stealth and magic skills. They are naturally \nresistant to fire and can call upon their Ancestor's Wrath to surround \nthemselves in fire.",1);
			break;
		case 5: if (gender.equals("m")) output(p.getImperialM(),1);
				else output(p.getImperialF(),1);
				character[1] = "Imperial";
				output("Natives of Cyrodiil, they have proved to be shrewd diplomats and \ntraders. They are skilled with combat and magic. Anywhere gold coins \nmight be found, Imperials always seem to find a few more. They can \ncall upon the Voice of the Emperor to calm an enemy.",1);
			break;
		case 6: if (gender.equals("m")) output(p.getKhajiitM(),1);
				else output(p.getKhajiitF(),1);
				character[1] = "Khajiit";
				output("Hailing from the province of Elsweyr, they are intelligent, quick, and \nagile. They make excellent thieves due to their natural stealthiness.\nAll Khajiit can see in the dark at will and have unarmed claw attacks.",1);
			break;
		case 7: if (gender.equals("m")) output(p.getNordM(),1);
				else output(p.getNordF(),1);
				character[1] = "Nord";
				output("Citiezens of Skyrim, they are a tall and fair haired poeople. Strong \nand hardy, Nords are famous for their resistance to cold and their talent \nas warriors. They can use a Battlecry to make opponents flee.",1);
			break;
		case 8: if (gender.equals("m")) output(p.getOrcM(),1);
				else output(p.getOrcF(),1);
				character[1] = "Orc";
				output("The people of the Wrothgarian and Dragontail Mountains, Orcish \nsmiths are prized for their craftsmanship. Orc troop in Heavy Armor \nare among the finest in the Empire, and are fearsome when using \ntheir Berserker Rage.",1);
			break;
		case 9: if (gender.equals("m")) output(p.getRedguardM(),1);
				else output(p.getRedguardF(),1);
				character[1] = "Redguard";
				output("The most naturally talented warriors in Tamriel, the Redguards of \nHammerfell have a hardy constitution and a natural resistance to \npoison. They can call upon an Adrenaline Rush in combat.",1);
			break;
		}
	}
	
	
	
}
