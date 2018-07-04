package functions;

import game.Basic;

public class Walking extends Basic{
	

	/*
	 * Method to walk
	 * Fileexplanation:
	 * 	 *	; Diffrent Paragraphs
	 *	/ Options
	 *	% For new Point
	 *	<Quicktravle true or false>/<Encounter ID>/<Pointdescription>/<1.Path description>/<1.PunktID>/<1.Walk description>/<2.Path description>/<2.PunktID>/<2<.Walk description>% 
	 *	 ';' used for separate lines
	 * @param return the new Point
	 */
	public int walk(int currentPosition) {
		clear();
		String currentPoint[] = getStringFromMap("Test").split("%")[currentPosition].split("/");
		doSimpleDialog(currentPoint[3].split(";"));
		output("0. Open Inventory");
		for (int i = 4; i < currentPoint.length; i+=3) {
			output(Integer.toString(i/3)+". "+currentPoint[i]);
		}
		output("where do you go?");
		int newPos = getInt();;
		while (newPos < 0 | newPos > (currentPoint.length-4)/3) {
			output("Please enter a number between 0 and "+Integer.toString((currentPoint.length-4)/3));
			newPos = getInt();
		}
		if (newPos == 0) {
			output("You opened your Inventory \nit is empty");
			return currentPosition;
		}
		else {
			doSimpleDialog(currentPoint[newPos*3+3].split(";"));
			return Integer.parseInt(currentPoint[newPos*3+2].replaceAll(" ",""));
		}
	}
	
	
}