package controllz;

import java.util.Scanner;

import data.Pictures;

public class SkyrimSuperVerySpecialEdition extends Basic {
	static Pictures p = new Pictures();
	static Game g;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		intro(); 
		

		
	}
	
	
	private static void intro() {
		clear();
		output(p.getBethesda(), 2);
		wait(3000);
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
		clear();
		g = new Game();
	}
	
	private static void loadGame() {
		clear();
		//TODO Load game
	}
	
	private static void getHelp() {
		clear();
		String help =
				"This is a Textadventrue \n\n" +
				"You control just with the keyboard \n"+
				"On the left side you can find a letter or number \n"+
				"Press it and then enter to choose this option \n"+
				"That's all \n\n"+
				"We recommend some experience with Skyrim \n"+
				"This game is not completed yet and in an very early Alpha-Stage \n" +
				"We are sorry";
		output(help);
		waitForInput();
				
	}
	
	private static void showCredits() {
		clear();
		String creditsText = 
			"This game was developed by: \n" +
			"Lenny5156					 \n" + 
			"MC2BP						 \n" + 
			"							 \n" +
			"Thank you for playing this Game. \n\n" +
			"You can support our work via [No option yet]";
		output(creditsText);
		waitForInput();
	}
	

	
	
}
