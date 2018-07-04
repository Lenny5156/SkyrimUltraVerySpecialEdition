package functions;

import game.Basic;

public class Conversation extends Basic {
	/*
	 * ID/TextOption/Option1/ID1/Text1/Option2/ID2/Text2
	 * To end the conversation make the Text2 to an number only
	 */
	public int simpleConversation(String textFile, int point) {
		clear();
		String[] textRaw = getStringFromText("conversation/"+textFile).split("%")[point].split("/");
		doSimpleDialog(textRaw[1].split(";"));
		for (int i = 2; i < textRaw.length; i += 3) {
			output(Integer.toString((i+1)/3)+". "+textRaw[i]);
		}
		int in = getInt();
		while (in < 0 | in > (textRaw.length-2)/3) {
			output("Wrong Input");
			in = getInt();
		}
		try {
			return Integer.parseInt(textRaw[in*3+1].replaceAll(" ", ""));
		} catch (Exception e) {
			clear();
			doSimpleDialog(textRaw[in*3+1].split(";"));
			waitForInput();
			return simpleConversation(textFile, Integer.parseInt(textRaw[in*3]));
		}
	}
	
	
	
}
