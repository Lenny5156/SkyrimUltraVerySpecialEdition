package functions;

import controllz.Basic;

public class RaceMenu extends Basic{
	
	private String[] character;
	private String raceOptions = "Choose your race \n HighElve, Argonian, WoodElve, Breton, DarElve, Imperial, Khajiit, Nord, Orc, Redguard";
	
	public String[] createCharacter() {
		while (true) {
			output(raceOptions);
			wait(10000);
			waitForInput();
			return character;
		}
	}
	
	
	
}
