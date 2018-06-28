package quests.main;

import controllz.Basic;

public class Intro extends Basic{
	
	public static void introSequence(int n, String r, boolean g) {
		switch(n) {
		case 1:
			output(getStringFromPicture("Skyrim"),2);
			waitForInput();
			doSimpleDialog(introText1);
			break;
		case 2:
			switch(r) {
				case("HighElve"):
					output(introTextRace1[0]);
					break;
				case("Argonian"):
					output(introTextRace1[1]);
					break;
				case("WoodElve"):
					output(introTextRace1[2]);
					break;
				case("Breton"):
					output(introTextRace1[3]);
					break;
				case("DarkElve"):
					output(introTextRace1[4]);
					break;
				case("Imperial"):
					output(introTextRace1[5]);
					break;
				case("Khajiit"):
					output(introTextRace1[6]);
					break;
				case("Nord"):
					output(introTextRace1[7]);
					break;
				case("Orc"):
					output(introTextRace1[8]);
					break;
				case("Redguard"):
					output(introTextRace1[9]);
					break;
			}
			waitForInput();
			if(g){
				output(introTextGender[0]);
				waitForInput();
				output(introTextGender[2]);
			}else {
				output(introTextGender[1]);
				waitForInput();
				output(introTextGender[3]);
			}
			waitForInput();
			switch(r) {
				case("HighElve"):
					output(introTextRace2[0]);
					break;
				case("Argonian"):
					output(introTextRace2[1]);
					break;
				case("WoodElve"):
					output(introTextRace2[2]);
					break;
				case("Breton"):
					output(introTextRace2[3]);
					break;
				case("DarkElve"):
					output(introTextRace2[4]);
					break;
				case("Imperial"):
					output(introTextRace2[5]);
					break;
				case("Khajiit"):
					output(introTextRace2[6]);
					break;
				case("Nord"):
					output(introTextRace2[7]);
					break;
				case("Orc"):
					output(introTextRace2[8]);
					break;
				case("Redguard"):
					output(introTextRace2[9]);
					break;
			}
			waitForInput();
			doSimpleDialog(introText2);
		}
	}
	
	
	
	
	
	
		static String[] introText1 = {
		"You wake up. You sit in a horse car, three other people are next to you.\r\n" +
		"A strong man with long blond hair speaks to you.\r\n" ,
		"Ralof: 	Hey, you. You're finally awake.\r\n" + 
		"	You were trying to cross the border, right?\r\n" +
		"	Walked right into the Imperial ambush, same as us,\r\n" + 
		"	and that thief over there.\r\n" ,
		"He's pointing with his Head to the other man in the carriage.\r\n" ,
		"Lokir: Damn you Stormcloaks. Skyrim was fine until you came along.\r\n" +
		"	Empire was nice an lazy.\r\n" + 
		"	If they haden't been looking for you,\r\n" + 
		"	I could've stolen that horse and be halfway to Hammerfell.\r\n" + 
		"	You there. You and me - we shouldn't be here.\r\n" + 
		"	It's these Stormcloaks the Empire wants.\r\n" ,
		"Ralof: 	We're all brothers and sisters in binds now, thief.\r\n" ,
		"An Imperial is looking back und shouts:\r\n" + 
		"	Shut up back there!\r\n" ,
		"Lokir is looking to the forth men in the horse car, which has ben gagged, and says:\r\n" + 
		"	And what's wrong with him, huh?\r\n" ,
		"Ralof replayed enraged:\r\n" + 
		"	Watch your tongue. You're speaking to Ulfric Stormcloak, the true High King.\r\n" ,
		"Lokir says shocked:\r\n" + 
		"	Ulfric? The Jarl of Windhelm? You're the leader of the rebellion.\r\n" + 
		"	But if they've captured you... Oh gods, where are they taking us?\r\n" + 
		"	I don't know where we're going, but Sovenguarde awaits.\r\n" ,
		"Lokir replayed scared:\r\n" + 
		"	No, this can't be happening.\r\n" ,
		"Ralof:	Hey, what village are you from horse thief?\r\n" ,
		"Lokir:	Why do you care?\r\n" ,
		"Ralof:	A Nord's last thoughts should be of home.\r\n" , 
		"Lokir:	Rorikstead. I'm ... I'm from Rorinkstead.\r\n" ,
		"The horse with the car is entering Helgen. A tiny town surrounded by a wall.\r\n" ,
		"The Imperial Soldier is calling the General:\r\n" + 
		"	General Tullius, sir! The headsman is waiting!\r\n" ,
		"The General is saying sharp:\r\n" + 
		"	Good. Let's get over this.\r\n" ,
		"Lokir is praying:\r\n" + 
		"	Shor, Mara, Dibella, Kynareth, Akatosh. Divines, please help me.\r\n" ,
		"Ralof is mumbling scornfully:\r\n" + 
		"	Look at him, General Tullius the Military Governor.\r\n" + 
		"	And it looks like the Thalmor are with him. Damn elves.\r\n" + 
		"	I bet they had something to do with this.\r\n" + 
		"	This is Helgen. I used to be sweet on a girl from here.\r\n" + 
		"	Wonder if Vilod is still making that mead with juniper berries mixed in.\r\n" + 
		"	Funny, when I was a boy, imperial walls and towers used to make me feel so safe.\r\n" ,
		"A little boy named Hamming is asking:\r\n" +
		"	Who are they, daddy? Where are they going?\r\n" ,
		"The father is calling:\r\n" + 
		"	You need to go inside, little cub.\r\n" ,
		"The boy is arguing:\r\n" + 
		"	Why? I want to watch the soldiers.\r\n" ,
		"The father is shouting:\r\n" + 
		"	Inside the house. Now.\r\n" ,
		"The boy is walking sadly back in the house.\r\n" ,
		"The car stops and an Imperial Captain is screaming:\r\n" + 
		"	Get these prisoners out of the carts. Move it!\r\n" , 
		"Lokir is asking scared:\r\n" + 
		"	Why are we stopping?\r\n" ,
		"Ralof is replying calm:\r\n" + 
		"	Why do you think? End of the line.\r\n" + 
		"	Let's go. Shouldn't keep the gods waiting for us.\r\n",
		"Everyone stands up and leave the car.\r\n" ,
		"Lokir is begging:\r\n" + 
		"	No! Wait! We're not rebels!\r\n" ,
		"Ralof is commenting disrespectfully:\r\n" + 
		"	Face your death with some courage, thief.\r\n" ,
		"Lokir is telling:\r\n" + 
		"	You've got to tell the,! We weren't with you! This is a mistake!\r\n" ,
		"As everyone has left the car the Imperial Captain is ordering:\r\n" + 
		"	Step towards the block when we call your name. One at a time.¨\r\n" , 
		"Ralof: Empire loves their damn lists.\r\n" ,
		"Hadevar, an Imperial Soldier, with a list is calling:\r\n" +
		"	Ulfric Stormcloak. Jarl of Windhelm.\r\n" ,
		"Ralof is saying respectfully:\r\n" + 
		"	It has been an honor, Jar Ulfric!\r\n" ,
		"Ulfric is walking to the people surrounding the block.\r\n" ,
		"Hadevar: Ralof of Riverwood.\r\n" + 
		"		 Lokir of Rorikstead.\r\n" ,
		"Lokir is begging for help:\r\n" + 
		"	No, i'm not a rebel. You can't do this!\r\n" ,
		"Lokir started running away.\r\n" ,
		"Imperial Captain: Halt\r\n" ,
		"Lokir: You're not going to kill me!\r\n" ,
		"Imperial Captain is shouting:\r\n" + 
		"	Archers!\r\n" ,
		"The Archers are shooting at him after one shot he's falling death to the ground.\r\n" ,
		"Imperial Captain is asking proud:\r\n" + 
		"	Anyone else feel like running?\r\n" ,
		"Hadevar is pointing on you:\r\n" + 
		"	Wait. You there. Step forward.\r\n" ,
		"	Who are you?"
	};
	
	static String[] introTextRace1 = {
		"Hadvar is asking: \r\n"+
		"	You're not with the Thalmor Embassy, are you high elf? no, that can't be right....",
		"Hadvar is asking: \r\n"+ 
		"	Are you a relative of one of the Riften dock workers, Argonian?",
		"Hadvar is saying: \r\n"+
		"	Not many wood elves would choos to come alone to Skyrim.",
		"Hadvar is asking: \r\n"+ 
		"	You from Daggerfall, Breton? Fleeing from some court intrigue?",
		"Hadvar is asking: \r\n"+
		"	Another refugee? Gods really have abondoned your people, dark elf.",
		"Hadvar is asking: \r\n"+
		"	You're a long way from the Imperial City. What're you doing in Skyrim?",
		"Hadvar is asking: \r\n"+
		"	You with the trade caravans, Khajiit? Your kind always seems to find trouble.",
		"Hadvar is saying: \r\n"+
		"	You picked a bad time to come home to Skyrim, kinsman.",
		"Hadvar is asking: \r\n"+ 
		"	You from one of the strongholds, Orc? How did you end up here?",
		"Hadvar is asking: \r\n"+
		"	What're you doing here, Redguard? You a sellsword? A sailor from Stors m'kai?"
	};
	
	static String[] introTextRace2 = {
		"Hadvar is saying regrettingly: \r\n"+
		"	I'm sorry. We'll make sure your remains are retuned to the Summerset Isle.",
		"Hadvar is saying regrettingly: \r\n"+
		"	I'm sorry. We'll make sure your remains are retuned to Black Marsh.",
		"Hadvar is saying regrettingly: \r\n"+
		"	I'm sorry. We'll make sure your remains are retuned to Valenwood.",
		"Hadvar is saying regrettingly: \r\n"+
		"	I'm sorry. We'll make sure your remains are retuned to High Rock.",
		"Hadvar is saying regrettingly: \r\n"+
		"	I'm sorry. We'll make sure your remains are retuned to Morrowind.",
		"Hadvar is saying regrettingly: \r\n"+
		"	I'm sorry. We'll make sure your remains are retuned to Cyrodiil.",
		"Hadvar is saying regrettingly: \r\n"+
		"	I'm sorry. We'll make sure your remains are retuned to Elsweyr.",
		"Hadvar is saying regrettingly: \r\n"+
		"	I'm sorry. At least you'll die here, in your homeland.",
		"Hadvar is saying regrettingly: \r\n"+
		"	I'm sorry. We'll make sure your remains are retuned to Orsinium.",
		"Hadvar is saying regrettingly: \r\n"+
		"	I'm sorry. We'll make sure your remains are retuned to Hammerfell."
	};
	String[] introTextRace3 = {
		"	Next, the high elf!",
		"	Next, the lizard!",
		"	Next, the wood elf!",
		"	Next, the Breton!",
		"	Next, the dark elf!",
		"	Next, the renegade from Cyrodiil!",
		"	Next, the cat!",
		"	Next, the Nord in the rags!",
		"	Next, the Orc!",
		"	Next, the Redguard!"
	};
	static String[] introTextGender = {
		"	Captain. What should we do? He's not on the list.",
		"	Captain. What should we do? She's not on the list.",
		"Imperial Captain: Forget the list. He goes to the block.",
		"Imperail Captain: Forget the list. She goes to the block."
		};
	static String[] introText2 = {
		"	Folow the Captain, prisoner.\r\n",
		"The Captain is leading you to the block.",
		"Tulius is saying disapointed:\r\n"+
		"	Ulfric Stormcloak. Some here in Helgen call you a hero. \r\n"+
		"	But a hero doesn't use a power like the Voice to murder his king and usurp his throne.\r\n",
		"Ulfric is muffling something\r\n",
		"Tulius is responding:\r\n"+
		"	You started this war, pluged Skyrim into chaos, and now the Empire is going to put you down,\r\n"+
		"	and restore the peace.\r\n",
		"A scary non human scream is resonating.\r\n",
		"Hadvar is asking wondering:\r\n"+ 
		"	What was that?",
		"Tulius is responding:\r\n"+
		"	It's nothing. Carry on.\r\n",
		"Captain is saying:\r\n"+
		"Yes, general Tullius.",
		"Captain is saying to the Pristess of Arkay:\r\n"+
		"	Give them their last rites.",
		"Pristess is praying:\r\n"+
		"	As we commend your souls to Aetherius, blessings of the Eight Divines upon you,"+ 
		"	for you are the salt and earth of Nirn, our beloved....",
		"A Stormcloak Soldier is moving forward and is saying bored:\r\n"+
		"	For the love of Talos, shut up and let's get this over with.",
		"The Priestress of Arkay is responding surprised:\r\n"+
		"	As you wish.",
		"The Stormcloak Soldier is nagging:\r\n"+
		"	Come on, I haven't got all morning.\r\n"+
		"	My ancesters are smiling at me, Imperials. Can you say the same?\r\n",
		"The Stormcloak Soldier is moving to the block and is kneeing infront of it.\r\n"+
		"The Hangman is strinkeing out and is chopping the Soldiers head off.",
		"An Imperial "
		
		
		
	};
}
