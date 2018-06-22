package player;

import npc.Person;

public class Player extends Person {
	
	public Player(String[] characterOptions) {
		setRace(characterOptions[1]);
		name = characterOptions[2];
		if (characterOptions[0].equals("w")) gender = false;
	}
	
	public int gold;
	public int bounty;
	
	
}
