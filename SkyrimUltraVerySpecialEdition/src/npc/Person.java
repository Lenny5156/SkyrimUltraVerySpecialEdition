package npc;

public abstract class Person {
	//NPC Infos
	public String name;
	
	public String civilWarState;
	public String faction;
	
	
	public int level;
	public int stamina;
	public int health;
	public int magicka;
	
	
	private void updateLevel(int min, int max, int playerLevel) {
		level = playerLevel;
		if(level < min) {
			level = min;
		}else if(level>max) {
			level = max;
		}
	}
}
