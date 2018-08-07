package quests.main;

import game.Basic;

public class Intro {

	public void introSequence(int n, String r, boolean g) {
		switch (n) {
		case 1:
			Basic.output(Basic.getStringFromPicture("Skyrim"), 2);
			Basic.waitForInput();
			Basic.doSimpleDialog(Basic.getStringFromText("quests/intro/Intro").split("@")[0].split(";"));
			break;
		case 2:
			Basic.output(Basic.getStringFromText("quests/intro/Intro" + r).split(";")[0]);
			Basic.waitForInput();

			if (g) {
				Basic.doSimpleDialog(Basic.getStringFromText("quests/intro/IntroM").split(";"));
			} else {
				Basic.doSimpleDialog(Basic.getStringFromText("quests/intro/IntroF").split(";"));
			}
			Basic.waitForInput();
			Basic.output(Basic.getStringFromText("quests/intro/Intro" + r).split(";")[1]);
			Basic.doSimpleDialog((Basic.getStringFromText("quests/intro/Intro").split("@")[1]).split(";"));
			Basic.output(Basic.getStringFromText("quests/intro/Intro" + r).split(";")[2]);
			Basic.doSimpleDialog((Basic.getStringFromText("quests/intro/Intro").split("@")[2]).split(";"));
		}
	}
}
