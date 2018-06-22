package controllz;

import java.util.Scanner;

public abstract class Basic {
	
	static int textSpeed = 45;
	
	public static Scanner input = new Scanner(System.in);
	
	//Lets the Programm wait for the @param time in milliseconds
	public static void wait(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) { 
			output(":(");
			output("We are very sorry but the programm crashed trying to wait");
			e.printStackTrace();
		}
	}
	
	//Function for an Output (We're just too lazy to write over and over System.out.println("...");
	public static void output(String message) {
		System.out.println(message);
	}
	
	//Function for an Output (Character for Character delay is in milliseconds)
	public static void printCharForChar(String message, int delay) {
		char[] text = message.toCharArray();
		for (int i = 0; i < text.length; i++) {
			System.out.print(text[i]);
			if (text[i] != ' ') wait(delay);
		}
	}
	
	public static void output(String message, int delay) {
		printCharForChar(message,delay);
		System.out.println("");
	}
	
	//Waits for an enter
	public static void waitForInput() {
		input.nextLine();
	}
	
	//"clears" the console (in reality it just writes 100 empty lines)
	public static void clear() {
		for (int i = 0; i < 100; i++) System.out.println("\n");
	}
	
	
	
	//Makes a simple Dialog 
	public static void doSimpleDialog(String[] dialog) {
		for (int i = 0; i < dialog.length; i++) {
			printCharForChar(dialog[i], textSpeed);
			waitForInput();
		}
	}
	
}
