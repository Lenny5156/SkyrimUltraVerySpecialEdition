package data;

import java.io.InputStream;

public class FileHandler {
	//This class is just used to store ASCII-Arts
	
	//Gives back the inputstream of the file
	public static InputStream getPicture(String pic) {
		return FileHandler.class.getResourceAsStream("pictures/"+pic);
	}
	
	//Gives back the inputstream of the file in the package text
	public static InputStream getText(String text) {
		return FileHandler.class.getResourceAsStream("text/"+text);
	}
	
}