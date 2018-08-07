package menuz;

import game.Basic;
import game.Game;

public class MainMenu {

	Game g;

	// The Bethesdan't logo
	private void bethesda() {
		Basic.clear();
		Basic.output(Basic.getStringFromPicture("Bethesda"), 2);
		Basic.wait(3000);
		Basic.clear();
	}

	// Menu in which you can load or start a new game.
	public MainMenu() {
		bethesda();
		Basic.output(Basic.getStringFromPicture("Logo"), 5);
		String mainMenuOption = Basic.input.nextLine();
		while (!mainMenuOption.equals("q")) {
			if (mainMenuOption.equals("c"))
				showCredits();
			else if (mainMenuOption.equals("l"))
				loadGame();
			else if (mainMenuOption.equals("n"))
				newGame();
			else if (mainMenuOption.equals("h"))
				getHelp();
			Basic.clear();
			Basic.output(Basic.getStringFromPicture("Logo"), 5);
			mainMenuOption = Basic.input.nextLine();
		}
		Basic.output("Bye");
		Basic.wait(1000);
	}

	/*
	 * Menu Options
	 */

	// Starts a new game
	private void newGame() {
		Basic.clear();
		g = new Game();
	}

	// Loads a game
	private void loadGame() {
		Basic.clear();
		// TODO Load game
	}

	// Shows a short tutorial
	private void getHelp() {
		Basic.clear();
		String help = "This is a Textadventure \n\n" + "You control the game just with the keyboard \n"
				+ "Enter the optiono you want (letter of number) \n" + "and then enter to choose this option \n"
				+ "That's all \n\n" + "We recommend some experience with Skyrim \n"
				+ "This game is not completed yet and in a very early Alpha-Stage \n" + "We are sorry";
		Basic.output(help);
		Basic.waitForInput();
	}

	// Shows the developer
	private void showCredits() {
		Basic.clear();
		String creditsText = "This game was developed by: \n" + "Lenny5156					 \n"
				+ "MC2BP						 \n" + "							 \n"
				+ "Thank you for playing this Game.";
		Basic.output(creditsText);
		Basic.waitForInput();
	}
}
