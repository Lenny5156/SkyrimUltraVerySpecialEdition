package menuz;

import java.util.ArrayList;

import items.Item;
import game.Basic;

public class Inventory extends Basic{
	
	String menuOptions = "Which items do you want to see?" + "\n" +
							"all, alchemy, armor, book, food, key, potion, weapon, miscellaneous" + "\n" +
							"Enter \"exit\" to get back \"search\" for seaching an item by its name" + "\n" +
							"or  \"use\" to use or equip/unequip the item";
	
	//Shows a menu in which the player can use and see his items 
	public void showInventory(ArrayList<Item> inventory) {
		output(menuOptions);
		String in = input.next();
		while (!in.equals("exit")) {
			if (in.equals("search")) {
				searchItem(inventory);
			} else if (in.equals("use")) {
				useItem(inventory);
			} else if (in.equals("alchemy")|in.equals("armor")|in.equals("book")|in.equals("food")|in.equals("key")|in.equals("potion")|in.equals("weapon")|in.equals("miscellaneous")|in.equals("all")){
				searchCategory(inventory, in);
			}
			waitForInput();
			waitForInput();
			clear();
			output(menuOptions);
			in = input.next();
		}
		waitForInput();
	}
	
	//Used to search an item
	private void searchItem(ArrayList<Item> inventory) {
		clear();
		output("Please enter the name of the item");
		String in = input.next();
		output("  #|Quantity|Weight|Value|Item");
		output("---+-------+------+-----+-----");
		for (Item i: inventory) {
			if (i.item.contains(in)) {
				output(String.format("%1$"+8+ "s", i.quantity)+"|"+String.format("%1$"+6+ "s", i.weight)+"|"+String.format("%1$"+5+ "s", i.value)+"|"+i.item);
			}
		}
	}
	
	//Equips/unequips armore and weapons and also uses potions...
	private void useItem(ArrayList<Item> inventory) {
		clear();
		output("Please enter the ID of the Item you want to use");
		int inputInt = getInt();
		boolean used = false;
		for (Item i: inventory) {
			if (i.id == inputInt) {
				used = true;
				i.use();
			}
		}
		if (!used) {
			output("Sorry but the item with the ID: "+Integer.toString(inputInt) + " is not in your inventory");
		}
	}
	
	//Shows all item with the category
	private void searchCategory(ArrayList<Item> inventory, String category) {
		clear();
		output("  #|Quantity|Weight|Value|Item");
		output("---+-------+------+-----+-----");
		for (Item i: inventory) {
			if (i.type.toLowerCase().equals(category.toLowerCase()) | category.equals("all")) {
				output(String.format("%1$"+3+"s", i.id)+"|"+String.format("%1$"+8+ "s", i.quantity)+"|"+String.format("%1$"+6+ "s", i.weight)+"|"+String.format("%1$"+5+ "s", i.value)+"|"+i.item);
			}
		}
	}
	
	
}