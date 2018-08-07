package npc;

import java.util.ArrayList;

import abilities.Ability;
import items.Item;
import shouts.Shout;
import spells.Spell;

public abstract class Animal {
	public String name;
	// Variables for current position
	public int mapPointID = 0;
	public String mapPart = "Test";
	// Arraylist for the inventory, spells, shouts and abilities.
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

	// Updates the level of the animal
	private void updateLevel(int min, int max, int playerLevel) {
		level = playerLevel;
		if (level < min) {
			level = min;
		} else if (level > max) {
			level = max;
		}
	}
	
	//Inventory handling -------------------------------------------------------------
	
	//removes an item from the inventory and gives back if its done
	public boolean removeItem(Item item, int amount) {
		for (Item i: inventory) {
			if (i.equals(item) && i.quantity >= amount) {
				i.quantity -= amount;
				if (i.quantity <= 0) {
					inventory.remove(i);
				}
				return true;
			}
		}
		return false;
	}
	//Removes the item from the inventory and gives it back
	public Item getItem(Item item, int amount) {
		Item returnItem = null;
		for (Item i: inventory) {
			if (i.equals(item) && i.quantity >= amount) {
				returnItem = i;
				returnItem.quantity = amount;
				i.quantity -= amount;
				if (i.quantity <= 0) {
					inventory.remove(i);
				}
			}
		}
		return returnItem;
	}

	//Add the item to the inventory
	public void addItem(Item item, int amount) {
		for (Item i: inventory) {
			if (i.equals(item)) {
				i.quantity += amount;
				return;
			}
		}
		item.quantity = amount;
		inventory.add(item);
	}
	//--------------------------------------------------------------------------------

	public ArrayList<Item> getInventory() {
		return inventory;
	}
	
}
