package controllz;

import java.util.Scanner;

import data.Pictures;

public class SkyrimSuperVerySpecialEdition {
	static Pictures p = new Pictures();
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		intro();
		

		
	}
	
	
	private static void intro() {
		output(p.getBethesda());
		wait(5000);
		mainMenu();
	}
	
	private static void mainMenu() {
		output(p.getLogo());
		String mainMenuOption = input.next();
		while(!mainMenuOption.equals("q")) {
			if (mainMenuOption.equals("c")) showCredits();
			else if (mainMenuOption.equals("l")) loadGame();
			else if (mainMenuOption.equals("n")) newGame();
			else if (mainMenuOption.equals("h")) getHelp();
			output(p.getLogo());
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
	
	
	
	/*
	 * Special Functions
	 */
	
	//Lets the Programm wait for the @param time ins milliseconds
	private static void wait(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			output(":(");
			output("We are very sorry but the programm crashed trying to wait");
			e.printStackTrace();
		}
	}
	
	//Function for an Output (We're just too lazy to write over and over System.out.println("...");
	private static void output(String message) {
		System.out.println(message);
	}
	
	
}
