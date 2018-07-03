package game;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import data.FileHandler;


public abstract class Basic {
	
	public Scanner input = new Scanner(System.in);
	
	//Speed in which doSimpleDialog show each char
	static int textSpeed;// 45 is a good value
	
	
	//Lets the Programm wait for the @param time in milliseconds
	public void wait(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) { 
			output(":(");
			output("We are very sorry but the programm crashed trying to wait");
			e.printStackTrace();
		}
	}
	
	//Function for an Output (We're just too lazy to write over and over System.out.println("...");
	public void output(String message) {
		System.out.println(message);
	}
	
	//Function for an Output NO newline
	public void simpleOutput(String message) {
		System.out.print(message);
	}
	
	//Function for an Output (Character for Character delay is in milliseconds)
	public void printCharForChar(String message, int delay) {
		char[] text = message.toCharArray();
		for (int i = 0; i < text.length; i++) {
			System.out.print(text[i]);
			if (text[i] != ' ') wait(delay);
		}
	}
	
	//Function to output an string char for char. At the end comes a new line
	public void output(String message, int delay) {
		printCharForChar(message,delay);
		System.out.println("");
	}
	
	//Waits for an enter
	public void waitForInput() {
		input.nextLine();
	}
	
	//"clears" the console (in reality it just writes 100 empty lines)
	public void clear() {
		//for (int i = 0; i < 100; i++) System.out.println("\n");
		try {
	    if (System.getProperty("os.name").contains("Windows"))
	      new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	    else
	    	System.out.print("\033\143");
	      //Runtime.getRuntime().exec("clear");
	  } catch (IOException | InterruptedException ex) {}
	}
	
	//Makes a simple Dialog 
	//The input is an StringArray and after one String is finished it waits for an enter
	public void doSimpleDialog(String[] dialog) {
		for (int i = 0; i < dialog.length; i++) {
			printCharForChar(dialog[i], textSpeed);
			waitForInput();
		}
		System.out.println("");
	}
	
	
	//Returns an int
	public int getInt() {
		String value;
		while (true) {
			value = input.next();
			try {
				return Integer.parseInt(value);
			} catch (Exception e) {
				output("Please enter a number");
			}
		}
	}
	// Filehandling ---------------------------------------
	
	//Gives back the string of an inputstream
	public String getStringFromStream(InputStream is) {
		return new Scanner(is).useDelimiter("[^n\r]\n+").next();
	}
	
	//gives back the String from the file in the package data.pictures
	public String getStringFromPicture(String file) {
		return getStringFromStream(FileHandler.getPicture(file));
	}
	
	//gives back the String from the file in the package data.text
	public String getStringFromText(String file) {
		return getStringFromStream(FileHandler.getText(file));
	}
	
	//gives back the String from the file in the package data.map
	public String getStringFromMap(String file) {
		return getStringFromStream(FileHandler.getMap(file));
	}
	
	//---------------------------------------------------
	
	/* Outputs a text (Must be singleline) in a frame
	 * |----|
	 * |Test|
	 * |----|
	 */
	public void outputStringInFrame(String text) {
		int length = text.length();
		simpleOutput("|");
		for (int i = 0; i < length; i++) simpleOutput("-");
		simpleOutput("|\n|");
		simpleOutput(text);
		simpleOutput("|\n|");
		for (int i = 0; i < length; i++) simpleOutput("-");
		output("|");
	}
	
}
