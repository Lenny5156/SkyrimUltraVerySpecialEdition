package controllz;

import java.util.Scanner;

import data.Pictures;

public class SkyrimSuperVerySpecialEdition extends basic {
	static Pictures p = new Pictures();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		intro();
		

		
	}
	
	
	private static void intro() {
		clear();
		output(p.getBethesda(), 3);
		waitForInput();
		clear();
		mainMenu();
	}
	
	private static void mainMenu() {
		output(p.getLogo(), 5);
		String mainMenuOption = input.next();
		while(!mainMenuOption.equals("q")) {
			if (mainMenuOption.equals("c")) showCredits();
			else if (mainMenuOption.equals("l")) loadGame();
			else if (mainMenuOption.equals("n")) newGame();
			else if (mainMenuOption.equals("h")) getHelp();
			output(p.getLogo(), 3);
			mainMenuOption = input.next();
		}
		output("Bye");
		wait(1000);
	}
	
	
	
	/*
	 * Menu Options
	 */
	
	private static void newGame() {
		
	}
	
	private static void loadGame() {
		//TODO Load game
	}
	
	private static void getHelp() {
		String help =
				"OOOOOOOuuh \n" +
				"you need help? \n"+
				"well you f*cked up";
		output(help);
				
	}
	
	private static void showCredits() {
		String creditsText = 
			"This game was developed by: \n" +
			"Lenny Johner				 \n" + 
			"Marcel Pfeuti				 \n" + 
			"							 \n" +
			"Thank you for playing this Game. \n\n" +
			"You can support our work via [No option yet]";
		output(creditsText);
		input.next();
	}
	

	
	
}
