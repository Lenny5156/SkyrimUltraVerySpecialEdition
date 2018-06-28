package npc;

public abstract class Person extends Animal {

	// NPC Infos
	public String civilWarState;
	public String faction;
	public boolean gender = false;
	public String race;
	public boolean waterbreathing = false;

	// values in Percent 100 = Standard 75% equals 25% resistance
	public double resistFatigue = 1;
	public double resistDisease = 1;
	public double resistPoison = 1;
	public double resistMagic = 1;
	public double resistFrost = 1;
	public double resistFire = 1;

	// Skillbonuses
	public int alterationSkillLevel = 15;
	public int archerySkillLevel = 15;
	public int alchemySkillLevel = 15;
	public int blockSkillLevel = 15;
	public int conjurationSkillLevel = 15;
	public int destructionSkillLevel = 15;
	public int enchantingSkillLevel = 15;
	public int heavyArmorSkillLevel = 15;
	public int illusionSkillLevel = 15;
	public int lightArmorSkillLevel = 15;
	public int lockPickingSkillLevel = 15;
	public int oneHandedSkillLevel = 15;
	public int pickPocketSkillLevel = 15;
	public int restorationSkillLevel = 15;
	public int smithingSkillLevel = 15;
	public int sneakSkillLevel = 15;
	public int speechSkillLevel = 15;
	public int twoHandedSkillLevel = 15;

	// Other bonuses
	public int magickaBonus = 0;
	public int staminaBonus = 0;
	public int healthBonus = 0;

	public double speed = 1; // Todo change speed depending on race
	public double unarmedDamageMultiplier = 1;
	public double goldMultiplier = 1;

	public int[][] bonus;

	// Sets the race with all skillincreases, abilities, spells...
	protected void setRace(String race) {
		this.race = race;
		switch (race) {
		case "HighElve":
			// Standard
			magickaBonus = 50;
			// Resistances
			resistFatigue = 0.75;
			// Skills
			illusionSkillLevel += 10;
			alterationSkillLevel += 5;
			conjurationSkillLevel += 5;
			destructionSkillLevel += 5;
			enchantingSkillLevel += 5;
			restorationSkillLevel += 5;
			// Todo add spell Fury
			break;
		case "Argonian":
			// Standard
			unarmedDamageMultiplier = 1.1;
			waterbreathing = true;
			// Resistances
			resistDisease = 0.5;
			resistFrost = 1.25;
			// Skills
			lockPickingSkillLevel += 10;
			alterationSkillLevel += 5;
			lightArmorSkillLevel += 5;
			pickPocketSkillLevel += 5;
			restorationSkillLevel += 5;
			sneakSkillLevel += 5;
			break;
		case "WoodElves":
			// Standard
			// Resistances
			resistPoison = 0.5;
			resistDisease = 0.5;
			resistFatigue = 0.75;
			// Skills
			archerySkillLevel += 10;
			alchemySkillLevel += 5;
			lightArmorSkillLevel += 5;
			lockPickingSkillLevel += 5;
			pickPocketSkillLevel += 5;
			sneakSkillLevel += 5;
			break;
		case "Breton":
			// Standard
			// Resistances
			resistMagic = 0.75;
			// Skills
			conjurationSkillLevel += 10;
			alchemySkillLevel += 5;
			alterationSkillLevel += 5;
			illusionSkillLevel += 5;
			restorationSkillLevel += 5;
			speechSkillLevel += 5;
			break;
		case "DarkElve":
			// Standard
			// Resistances
			resistFire = 0.5;
			resistFatigue = 0.75;
			// Skills
			destructionSkillLevel += 10;
			alchemySkillLevel += 5;
			alterationSkillLevel += 5;
			illusionSkillLevel += 5;
			lightArmorSkillLevel += 5;
			sneakSkillLevel += 5;
			// Todo ad spell Sparks
			break;
		case "Imperial":
			// Standard
			goldMultiplier = 1.1;
			// Resistances
			// Skills
			restorationSkillLevel += 10;
			blockSkillLevel += 5;
			enchantingSkillLevel += 5;
			heavyArmorSkillLevel += 5;
			oneHandedSkillLevel += 5;
			break;
		case "Khajiit":
			// Standard
			unarmedDamage = 12;
			// Resistances
			// Skills
			sneakSkillLevel += 10;
			alchemySkillLevel += 5;
			archerySkillLevel += 5;
			lockPickingSkillLevel += 5;
			pickPocketSkillLevel += 5;
			oneHandedSkillLevel += 5;
			break;
		case "Nord":
			// Standard
			// Resistances
			resistFrost = 0.5;
			// Skills
			twoHandedSkillLevel += 10;
			blockSkillLevel += 5;
			lightArmorSkillLevel += 5;
			oneHandedSkillLevel += 5;
			smithingSkillLevel += 5;
			speechSkillLevel += 5;
			break;
		case "Orc":
			// Standard
			// Resistances
			resistFatigue = 0.85;
			// Skills
			heavyArmorSkillLevel += 10;
			blockSkillLevel += 5;
			enchantingSkillLevel += 5;
			oneHandedSkillLevel += 5;
			smithingSkillLevel += 5;
			twoHandedSkillLevel += 5;
			// Todo status: Blood-Kin
			break;
		case "Redguard":
			// Standard
			// Resistances
			resistPoison = 0.5;
			// Skills
			oneHandedSkillLevel += 10;
			alterationSkillLevel += 5;
			archerySkillLevel += 5;
			blockSkillLevel += 5;
			destructionSkillLevel += 5;
			smithingSkillLevel += 5;
			break;
		}
	}

}
