package balsamFunHouse;

import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		VirtualPet pets = new VirtualPet("Joey", 83, 34, 23, " ");
		VirtualPetShelter shelterPets = new VirtualPetShelter();
		shelterPets.addVirtualPet(pets);
		VirtualPet oldPet = new VirtualPet("Johnny", 69, 49, 2, "");

		System.out.println("Thank you for Volunteering at Balsam's funhouse Virtual Pet Shelter");

		System.out.println("This is the status of your pets:");
		System.out.println("Name \t\t | Hunger \t\t | Thirst \t\t | Bored  ");
		System.out.println("_______________________________________________");
		System.out.println(" Joey \t |  83 \t |  34 \t | 23 \t ");
		System.out.println(" Johnny \t |  69 \t |  49 \t | 2 \t ");
		System.out.println(" Dee Dee \t |  39 \t |  18 \t | 88 \t ");
		System.out.println(" Tommy \t |  59 \t |  19 \t | 37 \t ");

		System.out.println("Do you want to continue?");
		String answer = input.nextLine();
		while (answer.equals("Yes")) {
		}
		System.out.println("What would you like to do next?");
		System.out.println("1. Feed the pets?");
		System.out.println("2. Water the pets?");
		System.out.println("3. Play with a pet?");
		System.out.println("Adopt a pet?");
		System.out.println("Quit?");

		String response = input.nextLine();

		switch (response) {

		case "1":
			shelterPets.callTick(pets);
			shelterPets.feedPets(pets);
			System.out.println("The bellies are filling ");
			break;

		case "2":
			shelterPets.callTick(pets);
			shelterPets.waterPets(pets);
			System.out.println("No more thirst");
			break;

		case "3":
			shelterPets.callTick(pets);
			System.out.println("Okay, so you'd like to play with a pet. Please choose one:");
			shelterPets.namePet(pets);
			String chosenPet = input.next();
			VirtualPet playPet = shelterPets.getPetNamed(chosenPet);
			System.out.println("you play with" + chosenPet);
			break;

		case "4":
			shelterPets.callTick(pets);
			shelterPets.showPetDescription(pets);
			System.out.println("Which pet would you like to adopt?");
			String petForAdoption = input.next();
			shelterPets.removePet(petForAdoption);
			System.out.println("Hope you enjoy your new pet!");
			break;

		case "5":
			shelterPets.callTick(pets);
			System.out.println("Who is this new pet?");
			String homelessPetName = input.next();
			VirtualPet homelessPet = new VirtualPet("Johnny", 69, 49, 2, "");
			System.out.println("Welcome to Balsam Fun House");
			break;

		}
		input.close();
	}
}
