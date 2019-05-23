package balsamFunHouse;

import java.util.Random;

public class VirtualPet {

	private String name;
	private int hunger;
	private int thirst;
	private int boredom;
	private int number;
	private int sleep;
	private String description;

	public VirtualPet(String name, int hunger, int thirst, int boredom, String description) {
		this.name = name;
		hunger = 5;
		thirst = 13;
		boredom = 12;
		this.description = description;
		int play = 20;
		int sleep = 50;

	}

	// getters
	public String getPetName() {

		return name;
	}

	public int getHunger() {

		return hunger;
	}

	public int getThirst() {

		return thirst;
	}

	public int getBoredom() {

		return boredom;
	}

	public int getNumber() {

		return number;
	}

	public String getPetDescription() {

		return description;
	}

	public int feed(int quantity) {

		return quantity;
	}

//setters
	public void setPetName(String petName) {
		this.name = petName;

	}

	public boolean isHungry() {
		if (hunger > 5) {
			return true;
		}
		return false;
	}

	public boolean isThirsty() {
		if (thirst > 13) {
			return true;
		}
		return false;
	}

	public void water(int volume) {
		this.thirst -= volume;
	}

	public boolean isBored() {
		if (boredom > 12) {
			return true;
		}
		return false;

	}

	public void play(int play) {
		this.boredom -= play;
	}

	public void sleep(int amount) {
		if (sleep > amount) {
		} else {
			hunger = amount;
		}
		System.out.println("I need to sleep");
	}

	public boolean isTired() {
		if (sleep > 50) {
			return true;
		}
		return false;
	}

	public String petStatus() {
		String feelingHungry = "";
		String feelingThirsty = "";
		String feelingBored = "";
		String feelingTired = "";

		if (this.isHungry()) {
			feelingHungry = "Getting hungry. Please give" + this.name + "some food.";

		}
		if (this.isThirsty()) {
			feelingThirsty = "Getting thirsty" + this.name + "some water.";
		}

		if (this.isBored()) {
			feelingBored = "This is boring. Play with me";

		}
		if (this.isTired()) {
			feelingTired = " Sleep time";
		}
		String petStatus = feelingHungry + feelingThirsty + feelingBored + feelingTired;

		return petStatus;
	}

	// tick generator
	public void tick() {
		hunger += (5 + generateRandom());
		thirst -= (10 + generateRandom());
		boredom -= (10 + generateRandom());

	}

	private int generateRandom() {
		// TODO Auto-generated method stub
		return 0;
	}

	// tick reset
	public void reset() {
		hunger = 70;
		thirst = 65;
		boredom = 70;

	}

	boolean petIsAlive() {

		if (hunger < 100 && thirst < 100 && boredom < 100)
			;
		{
			return true;
		}

	}
}
