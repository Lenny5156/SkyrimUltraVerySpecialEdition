package npc;

import java.util.ArrayList;

import abilities.Ability;
import items.Item;
import shouts.Shout;
import spells.Spell;

public abstract class Animal {
	public String name;
	//Variables for current position
	public int mapPointID = 0;
	public String mapPart = "Test";
	//Arraylist for the inventory, spells, shouts and abilities.
	public ArrayList<Item> inventory = new ArrayList<>();
	public ArrayList<Spell> speels = new ArrayList<>();
	public ArrayList<Shout> shouts = new ArrayList<>();
	public ArrayList<Ability> abilities = new ArrayList<>();
	
	public String soulSize;
	
	public int level;
	public int stamina;
	public int maxStamina;
	public int health;
	public int maxHealth;
	public int magicka;
	public int maxMagicka;
	public int unarmedDamage;
	
	//Updates the level of the animal
	private void updateLevel(int min, int max, int playerLevel) {
		level = playerLevel;
		if(level < min) {
			level = min;
		}else if(level>max) {
			level = max;
		}
	}
	
	
	
}
