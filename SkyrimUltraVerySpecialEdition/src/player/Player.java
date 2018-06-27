package player;

import java.util.ArrayList;

import npc.Person;
import quests.Quest;

public class Player extends Person {
	
	public ArrayList<Quest> quest = new ArrayList<>();
	public ArrayList<Quest> finishedQuest = new ArrayList<>();
	
	public Player(String[] characterOptions) {
		setRace(characterOptions[1]);
		name = characterOptions[2];
		if (characterOptions[0].equals("w")) gender = false;
		else gender = true;
	}
	
	public int gold;
	public int bounty;
	
	
}
