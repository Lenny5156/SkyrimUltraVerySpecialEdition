package npc;

import java.util.ArrayList;

import abilities.Ability;
import items.Item;
import shouts.Shout;
import spells.Spell;

public abstract class Animal {
	public String name;
	//Arraylist for the inventory, spells, shouts and abilities.
	ArrayList<Item> inventory = new ArrayList<>();
	ArrayList<Spell> speels = new ArrayList<>();
	ArrayList<Shout> shouts = new ArrayList<>();
	ArrayList<Ability> abilities = new ArrayList<>();
	
	
	public int level;
	public int stamina;
	public int maxStamina;
	public int health;
	public int maxHealth;
	public int magicka;
	public int maxMagicka;
	
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
