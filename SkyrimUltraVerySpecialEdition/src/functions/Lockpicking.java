package functions;

import game.Basic;

public class Lockpicking extends Basic{
	
	//Function for Lockpicken
	//TODO include lockpicks
	public static boolean lockPicking(int max, int length) {
		String pw = "";
		for (int i = 0; i < length; i++) {
			pw += Integer.toString((int)(Math.random()*max));
		}
		output(getStringFromPicture("other/lock"),1);
		output("Press h for help and q to quit");
		output("The input must match the length of the code");
		String output = "";
		for (int i = 0; i < pw.length(); i++) output += pw.toCharArray()[i];
		output(output);
		String i;
		while (true) {
			output("");
			i = input.next();
			while(i.length() != pw.length()) {
				if (i.equals("q")) return false;
				else if (i.equals("h")) showHelp();
				else output("incorrect input");
				i = input.next();
			}
			if (outputNumbers(pw,i)) return true;	
		}
			
	}
	
	//Checks if the player guessed the pw right
	//Also outputs the mistakes
	private static boolean outputNumbers(String n, String ip) {
		boolean returnValue = true;
		String output = "";
		char[] ui = ip.toCharArray();
		for (int i = 0; i < ui.length; i++) {
			if (ui[i] == n.toCharArray()[i]) output += " ";
			else {
				output += "X";
				returnValue = false;
			}
		}
		output(output);
		return returnValue;
	}
	
	//Outputs help
	private static void showHelp() {
		output("Explanation n/a");
	}
	

	
	
}
