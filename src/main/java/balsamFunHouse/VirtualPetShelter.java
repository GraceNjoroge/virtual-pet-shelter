package balsamFunHouse;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	Map<String, VirtualPet> virtualPets = new HashMap<String, VirtualPet>();

	public VirtualPet findPet(String petName) {
		return virtualPets.get(petName);
	}

	public void namePet(VirtualPet pets) {
		// TODO Auto-generated method stub

	}

	public Collection<VirtualPet> getAllPets() {
		return virtualPets.values();
	}

	public void addVirtualPet(VirtualPet pet) {
		virtualPets.put(pet.getPetName(), pet);

	}

	public void showPetDescription(VirtualPet pets) {
		// TODO Auto-generated method stub

	}

	public void adoptVirtualPet(VirtualPet pet1) {
		virtualPets.remove(pet1.getPetName());

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

	public void feedAll(Collection<VirtualPet> allPets, int quantity) {
		for (VirtualPet pet : allPets) {
			pet.feed(quantity);
		}
	}

	public void feedPets(VirtualPet pets) {
		// TODO Auto-generated method stub
	}

	public void waterAll(Collection<VirtualPet> allPets, int volume) {
		for (VirtualPet pet : allPets) {
			pet.water(volume);

		}
	}

	public void playWith(String petName, int value) {
		virtualPets.get(petName).play(value);
	}

	public void waterPets(VirtualPet pets) {
		// TODO Auto-generated method stub

	}

	public void updateAllTick(Collection<VirtualPet> allPets) {
		for (VirtualPet pet : allPets) {
			pet.tick();
		}
	}

	public void callTick(VirtualPet pets) {
		// TODO Auto-generated method stub

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
