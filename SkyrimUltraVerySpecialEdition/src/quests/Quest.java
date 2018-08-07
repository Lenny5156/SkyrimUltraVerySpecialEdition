package quests;

import game.Basic;

public abstract class Quest {
	
	public Quest(String name) {
		questName = name;
		Basic.outputStringInFrame(questName);
		
	}
	
	public String questGiver;
	public String questName;	
	public int questState;
	
	//Gives a description of the current state of the quest back
	public String getQuestState() {
		return Basic.getStringFromText("quests/questStates/"+questName).split(";")[questState];
	}
}
