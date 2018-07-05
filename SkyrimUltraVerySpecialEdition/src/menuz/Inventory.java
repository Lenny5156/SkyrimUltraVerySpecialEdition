package menuz;

import java.util.ArrayList;

import items.Item;
import game.Basic;

public class Inventory extends Basic{
	
	
	public void showInventory(ArrayList<Item> inventory) {
		output("Which items do you want to see?");
		output("all, alchemy, armor, book, food, key, potion, weapon, miscellaneous");
		output("Enter \"exit\" to get back or search for seaching an item by its name");
		String in = input.next();
		while (!in.equals("exit")) {
			if (in.equals("search")) {
				clear();
				output("Please enter the name of the item");
				in = input.next();
				output("Quantity|Weight|Value|Item");
				output("--------+------+-----+----");
				for (Item i: inventory) {
					if (i.item.contains(in)) {
						output(String.format("%1$"+8+ "s", i.quantity)+"|"+String.format("%1$"+6+ "s", i.weight)+"|"+String.format("%1$"+5+ "s", i.value)+"|"+i.item);
					}
				}
			} else {
				output("Quantity|Weight|Value|Item");
				output("--------+------+-----+----");
				for (Item i: inventory) {
					if (i.type.toLowerCase().equals(in.toLowerCase()) | in.equals("all")) {
						output(String.format("%1$"+8+ "s", i.quantity)+"|"+String.format("%1$"+6+ "s", i.weight)+"|"+String.format("%1$"+5+ "s", i.value)+"|"+i.item);
					}
				}
			}
			waitForInput();
			waitForInput();
			clear();
			output("Which items do you want to see?");
			output("all, alchemy, armor, book, food, key, potion, weapon, miscellaneous");
			output("Enter \"exit\" to get back or search for seaching an item by its name");
			in = input.next();
		}
		waitForInput();
	}
}
//String.format("%1$"+4+ "s", i.quantity);