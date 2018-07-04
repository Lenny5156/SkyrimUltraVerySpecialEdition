package player;

import java.util.ArrayList;

import functions.Walking;
import npc.Person;
import quests.Quest;

public class Player extends Person {
	
	//Quest the player is "working" on
	public ArrayList<Quest> quest = new ArrayList<>();
	//Quest the player finished
	public ArrayList<Quest> finishedQuest = new ArrayList<>();
	//Gold the player has
	public int gold;
	//Bountys
	/* 0 = Dawnstar
	 * 1 = Falkenreath
	 * 2 = Markarth
	 * 3 = Morthal
	 * 4 = Riften
	 * 5 = Solitude
	 * 6 = Whiterun
	 * 7 = Windhelm
	 * 8 = Winterhold
	 */
	public int bounty[] = new int[9];
	
	//Creates the player with the name, race and gender. Skills and abilities depending on the race will be automatically set.
	public Player(String[] characterOptions) {
		setRace(characterOptions[1]);
		name = characterOptions[2];
		if (characterOptions[0].equals("f")) gender = false;
		else gender = true;
	}
	
	String mapPart = "Helgen";
	
	public void walk() {
		String[] newPos = new Walking().walk(mapPointID, mapPart);
		mapPointID = Integer.parseInt(newPos[0]);
		mapPart = newPos[1];
	}
	
}
