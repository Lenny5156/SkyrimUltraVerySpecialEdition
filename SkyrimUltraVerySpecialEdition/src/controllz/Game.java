package controllz;

import functions.RaceMenu;
import player.Player;
import quests.main.Intro;

public class Game extends Basic{
	
	Intro intro = new Intro();
	RaceMenu rm = new RaceMenu();
	Player player;
	
	Game() {
		intro.introSequence(1,null,false);
		player = new Player(rm.createCharacter());
		intro.introSequence(2,player.race,player.gender);
		waitForInput(); 
	}
}
