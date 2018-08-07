package game;

import functions.RaceMenu;
import player.Player;
import quests.main.Intro;

public class Game {

	Player player;
	Intro intro = new Intro();
	RaceMenu raceM = new RaceMenu();

	public Game() {
		intro.introSequence(1, null, false);
		player = new Player(raceM.createCharacter());
		intro.introSequence(2, player.race, player.gender);
		while (true) {
			player.walk();
		}
	}
}
