package controllz;

import functions.RaceMenu;
import quests.main.Intro;

public class Game extends Basic{
	
	Intro intro = new Intro();
	RaceMenu rm = new RaceMenu();
	
	Game() {
		intro.introSequence();
		rm.createCharacter();
	}
}
