package controllz;

import java.util.Scanner;

import data.Pictures;

public class SkyrimSuperVerySpecialEdition {
	static Pictures p = new Pictures();
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		intro();
		while(true) {
			if(input.next().equals("ttt")) {
				output(p.getLogo());
			}else {
				output(p.getTitle());
			}
		}
		

		
	}
	private static void output(String message) {
		System.out.println(message);
	}
	
	private static void intro() {
		output(p.getBethesda());
	}
	
	
	
	
}
