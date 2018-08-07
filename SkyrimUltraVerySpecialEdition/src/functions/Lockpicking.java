package functions;

import game.Basic;

public class Lockpicking {

	// Function for Lockpicken
	// TODO include lockpicks
	public boolean lockPicking(int max, int length) {
		String pw = "";
		for (int i = 0; i < length; i++) {
			pw += Integer.toString((int) (Math.random() * max));
		}
		Basic.output(Basic.getStringFromPicture("other/lock"), 1);
		Basic.output("Press h for help and q to quit");
		Basic.output("The input must match the length of the code");
		String output = "";
		for (int i = 0; i < pw.length(); i++)
			output += pw.toCharArray()[i];
		Basic.output(output);
		String i;
		while (true) {
			Basic.output("");
			i = Basic.input.next();
			while (i.length() != pw.length()) {
				if (i.equals("q"))
					return false;
				else if (i.equals("h"))
					showHelp();
				else
					Basic.output("incorrect input");
				i = Basic.input.next();
			}
			if (outputNumbers(pw, i))
				return true;
		}

	}

	// Checks if the player guessed the pw right
	// Also outputs the mistakes
	private boolean outputNumbers(String n, String ip) {
		boolean returnValue = true;
		String output = "";
		char[] ui = ip.toCharArray();
		for (int i = 0; i < ui.length; i++) {
			if (ui[i] == n.toCharArray()[i])
				output += " ";
			else {
				output += "X";
				returnValue = false;
			}
		}
		Basic.output(output);
		return returnValue;
	}

	// Outputs help
	private void showHelp() {
		Basic.output("Explanation n/a");
	}

}
