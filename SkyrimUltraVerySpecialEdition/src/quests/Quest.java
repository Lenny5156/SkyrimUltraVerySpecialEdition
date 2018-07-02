package quests;

import game.Basic;

public abstract class Quest extends Basic{
	
	public Quest() {
		outputStringInFrame(questName);
		
	}
	
	public static String questGiver;
	public static String questName;	
	public static int questState;
	
	//Gives a description of the current state of the quest back
	public static String getQuestState() {
		return getStringFromText("quests/questStates/"+questName).split(";")[questState];
	}
}
