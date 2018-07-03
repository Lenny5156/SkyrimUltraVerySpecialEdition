package functions;

import game.Basic;

public class Walking extends Basic{
	

	/*
	 * Method to walk
	 * Fileexplanation:
	 * 	 *	; Diffrent Paragraphs
	 *	/ Options
	 *	% For new Point
	 *	<Quicktravle true or false>/<Encounter ID>/false>/<Pathdescription ';' used for separate lines>/<1.Option>/<PunktID>/<2.Option>/<PunktID>% 
	 *
	 * @param return the new Point
	 */
	public int walk(int currentPosition) {
		String currentPoint[] = getStringFromMap("Test").split("%")[currentPosition].split("/");
		doSimpleDialog(currentPoint[2].split(";"));
		output("0. Open Inventory");
		for (int i = 3; i < currentPoint.length; i+=3) {
			output(Integer.toString(i/3)+". "+currentPoint[i]);
		}
		output("where do you go?");
		int newPos = getInt();;
		while (newPos < 0 | newPos > (currentPoint.length-3)/3) {
			output("Please enter a number between 0 and "+Integer.toString((currentPoint.length-3)/3));
			newPos = getInt();
		}
		if (newPos == 0) {
			output("You opened your Inventory \nit is empty");
			return currentPosition;
		}
		else {
			doSimpleDialog(currentPoint[newPos*3+2].split(";"));
			return Integer.parseInt(currentPoint[newPos*3+1].replaceAll(" ",""));
		}
	}
	
	
}