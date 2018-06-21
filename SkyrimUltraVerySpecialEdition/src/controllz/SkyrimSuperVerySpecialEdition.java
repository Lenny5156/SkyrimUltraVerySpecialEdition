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
		output(p.getBethesda(), 2);
		waitForInput();
		clear();
		mainMenu();
	}
	
	private static void mainMenu() {
		output(p.getLogo(), 5);
		String mainMenuOption = input.nextLine();
		while(!mainMenuOption.equals("q")) {
			if (mainMenuOption.equals("c")) showCredits();
			else if (mainMenuOption.equals("l")) loadGame();
			else if (mainMenuOption.equals("n")) newGame();
			else if (mainMenuOption.equals("h")) getHelp();
			clear();
			output(p.getLogo());
			mainMenuOption = input.nextLine();
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
				"Ooooooouuh \n" +
				"you need help? \n"+
				"well you f*cked up \n" +
				"We are sorry";
		output(help);
		wait(1000);
		waitForInput();
				
	}
	
	private static void showCredits() {
		String creditsText = 
			"This game was developed by: \n" +
			"Lenny5156					 \n" + 
			"MC2BP						 \n" + 
			"							 \n" +
			"Thank you for playing this Game. \n\n" +
			"You can support our work via [No option yet]";
		output(creditsText);
		input.nextLine();
	}
	

	
	
}
