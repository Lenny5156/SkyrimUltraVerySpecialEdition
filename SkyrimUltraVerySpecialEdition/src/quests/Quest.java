package quests;

import game.Basic;

public abstract class Quest extends Basic{
	
	public Quest() {
		outputStringInFrame(questName);
		
	}
	
	
	public static String questGiver;
	public static String questName;
}
