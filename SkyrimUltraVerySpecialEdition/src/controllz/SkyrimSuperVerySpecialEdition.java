package controllz;

import java.io.File;

import data.Pictures;

public class SkyrimSuperVerySpecialEdition extends Basic {
	static Game g;
	
	public static void main(String[] args) {
		/*File intro = new File("");
		//output(getStringFromFile(new File("src/data/Intro.txt")));
		waitForInput();*/
		bethesda(); 
		mainMenu();
	}
	
	//The Bethesdan't logo
	private static void bethesda() {
		clear();
		output(Pictures.getBethesda(), 2);
		wait(3000);
		clear();
	}
	
	//Menu in which you can load or start a new game.
	private static void mainMenu() {
		output(Pictures.getLogo(), 5);
		String mainMenuOption = input.nextLine();
		while(!mainMenuOption.equals("q")) {
			if (mainMenuOption.equals("c")) showCredits();
			else if (mainMenuOption.equals("l")) loadGame();
			else if (mainMenuOption.equals("n")) newGame();
			else if (mainMenuOption.equals("h")) getHelp();
			clear();
			output(Pictures.getLogo());
			mainMenuOption = input.nextLine();
		}
		output("Bye");
		wait(1000);
	}
	
	
	
	/*
	 * Menu Options
	 */
	
	//Starts a new game
	private static void newGame() {
		clear();
		g = new Game();
	}
	
	//Loads a game
	private static void loadGame() {
		clear();
		//TODO Load game
	}
	
	//Shows a short tutorial
	private static void getHelp() {
		clear();
		String help =
				"This is a Textadventure \n\n" +
				"You control the game just with the keyboard \n"+
				"Enter the optiono you want (letter of number) \n"+
				"and then enter to choose this option \n"+
				"That's all \n\n"+
				"We recommend some experience with Skyrim \n"+
				"This game is not completed yet and in a very early Alpha-Stage \n" +
				"We are sorry";
		output(help);
		waitForInput();			
	}
	
	//Shows the developer
	private static void showCredits() {
		clear();
		String creditsText = 
			"This game was developed by: \n" +
			"Lenny5156					 \n" + 
			"MC2BP						 \n" + 
			"							 \n" +
			"Thank you for playing this Game.";
		output(creditsText);
		waitForInput();
	}
	

	
	
}
