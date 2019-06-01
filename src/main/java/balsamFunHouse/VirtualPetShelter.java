package balsamFunHouse;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class VirtualPetShelter {

	Map<String, VirtualPet> virtualPets = new HashMap<String, VirtualPet>();

	private int number = 0;

	public VirtualPet findPet(String petName) {
		return virtualPets.get(petName);
	}

	public Set<String> petNames() {

		return virtualPets.keySet();

	}

	public int getNumber() {
		return number;
	}

	public Collection<VirtualPet> getAllPets() {
		return virtualPets.values();
	}

	public void addVirtualPet(VirtualPet pet) {
		virtualPets.put(pet.getPetName(), pet);
		number++;

	}

	public void showPetDescription(VirtualPet pets) {
		// TODO Auto-generated method stub

	}

	public void adoptVirtualPet(VirtualPet pet1) {
		virtualPets.remove(pet1.getPetName());
		number--;

	}

	public void removePet(String petForAdoption) {
		// TODO Auto-generated method stub

	}

	public VirtualPet getPetNamed(String chosenPet) {
		// TODO Auto-generated method stub
		return null;
	}

	public void removeVariety(String petToRemove) {
		for (int i = virtualPets.size() - 1; i >= 0; i--) {
			if (virtualPets.get(i).getPetName().equals(petToRemove)) {
				virtualPets.remove(i);
				break;
			}
		}
	}

	public void feedAll() {
		for (VirtualPet pet : virtualPets.values()) {
			pet.feed(10);
		}

	}

	public void waterAll() {
		for (VirtualPet pet : virtualPets.values()) {
			pet.water(5);

		}
	}

	public void playWith(String petName, int value) {
		virtualPets.get(petName).play(value);
	}

	public void updateAllTick() {

		for (VirtualPet pet : virtualPets.values()) {
			pet.tick();
		}
	}

	public void updateAllPetStatus(Collection<VirtualPet> allPets) {
		for (VirtualPet pet : allPets) {
			System.out.println("Name \t\t | Hunger \t\t | Thirst \t\t | Bored  ");
			System.out.println("_______________________________________________");
			VirtualPet allPet;
			System.out.println(pet.getPetName() + " \t  |" + pet.getHunger() + " \t  |" + pet.getThirst() + " \t  |"
					+ pet.getBoredom() + "\t");
		}

	}

}
