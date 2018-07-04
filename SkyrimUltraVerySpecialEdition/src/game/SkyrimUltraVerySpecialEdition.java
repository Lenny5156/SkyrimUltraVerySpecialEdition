package game;

import menuz.MainMenu;

public class SkyrimUltraVerySpecialEdition {
	
	public static void main(String[] args) {
		if (args.length == 0) {
			new MainMenu();
		} else {
			Basic.textSpeed = 0;
			new Game();
		}
		
	}
	

	

	
	
}
