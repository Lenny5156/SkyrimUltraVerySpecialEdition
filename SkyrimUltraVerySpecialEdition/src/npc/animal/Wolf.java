package npc.animal;

import items.miscellaneous.WolfPelt;
import npc.Animal;

public class Wolf extends Animal {
	public Wolf() {
		//Stats
		name = "Wolf";
		maxHealth = 22;
		maxMagicka = 0;
		maxStamina = 205;
		unarmedDamage = 5;
		
		//Inventory
		inventory.add(new WolfPelt());
		if (Math.random() >= 0.1) {
			//inventory.add(new) todo add gem
		}
	}
}
