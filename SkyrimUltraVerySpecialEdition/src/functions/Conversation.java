package functions;

import game.Basic;

public class Conversation {
	/*
	 * ID/TextOption/Option1/ID1/Text1/Option2/ID2/Text2%
	 * % = new ConversationPoint
	 * / = Seperates Conversations
	 * To end the conversation make the Text2 to an number only
	 */
	public int simpleConversation(String textFile, int point) {
		Basic.clear();
		String[] textRaw = Basic.getStringFromText("conversation/"+textFile).split("%")[point].split("/");
		Basic.doSimpleDialog(textRaw[1].split(";"));
		for (int i = 2; i < textRaw.length; i += 3) {
			Basic.output(Integer.toString((i+1)/3)+". "+textRaw[i]);
		}
		int in = Basic.getInt();
		while (in < 0 | in > (textRaw.length-2)/3) {
			Basic.output("Wrong Input");
			in = Basic.getInt();
		}
		try {
			return Integer.parseInt(textRaw[in*3+1].replaceAll(" ", ""));
		} catch (Exception e) {
			Basic.clear();
			Basic.doSimpleDialog(textRaw[in*3+1].split(";"));
			Basic.waitForInput();
			return simpleConversation(textFile, Integer.parseInt(textRaw[in*3]));
		}
	}
	
	
	
}
