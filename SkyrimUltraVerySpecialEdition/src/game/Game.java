package game;

import functions.RaceMenu;
import player.Player;
import quests.main.Intro;

public class Game extends Basic{
	
	Player player;
	
	Game() {
		Intro.introSequence(1,null,false);
		player = new Player(RaceMenu.createCharacter());
		Intro.introSequence(2,player.race,player.gender);
		waitForInput();
	}
}
