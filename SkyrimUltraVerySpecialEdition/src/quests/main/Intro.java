package quests.main;

import quests.Quest;

public class Intro extends Quest{
	public static void introSequence(int n, String r, boolean g) {
		switch(n) {
		case 1:
			output(getStringFromPicture("Skyrim"),2);
			waitForInput();
			doSimpleDialog((getStringFromText("quests/intro/Intro").split("^")[1]).split(";"));
			break;
		case 2:
			output(getStringFromText("quests/intro/Intro"+r).split(";")[0]);
			waitForInput();
			if(g){
				doSimpleDialog(getStringFromText("quests/intro/IntroM").split(";"));
			}else {
				doSimpleDialog(getStringFromText("quests/intro/IntroF").split(";"));
			}
			waitForInput();
			output(getStringFromText("quests/intro/Intro"+r).split(";")[1]);
			doSimpleDialog((getStringFromText("quests/intro/Intro").split("^")[2]).split(";"));
			output(getStringFromText("quests/intro/Intro"+r).split(";")[2]);
		}
	}
}
