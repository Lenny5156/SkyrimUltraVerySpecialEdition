package quests;

import game.Basic;

public abstract class Quest extends Basic{
	
	public Quest(String name) {
		questName = name;
		outputStringInFrame(questName);
		
	}
	
	public String questGiver;
	public String questName;	
	public int questState;
	
	//Gives a description of the current state of the quest back
	public String getQuestState() {
		return getStringFromText("quests/questStates/"+questName).split(";")[questState];
	}
}
