package balsamFunHouse;

import static org.junit.Assert.assertEquals;

import java.util.Collection;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class PetShelterTest {

	VirtualPetShelter underTest;
	VirtualPet pet1;
	VirtualPet pet2;

	@Before
	public void initial() {
		// Arrange
		underTest = new VirtualPetShelter();
		pet1 = new VirtualPet("Twinkle", 34, 20, 12, "laughs endlessly");
		pet2 = new VirtualPet("Jimmy", 15, 10, 45, "snores loudly");

	}

	@Test
	public void shouldAddOnePetToShelter() {
		// Act
		underTest.addVirtualPet(pet1);
		VirtualPet retrievedPet = underTest.findPet("Twinkle");
		assertThat(retrievedPet, is(pet1));

	}

	@Test
	public void shouldAddTwoPetsToShelter() {
		// Act
		underTest.addVirtualPet(pet1);
		underTest.addVirtualPet(pet2);
		Collection<VirtualPet> allPets = underTest.getAllPets();
		// Assert
		assertEquals(2, allPets.size());
	}

	@Test
	public void shouldAdoptAPet() {
		// Act
		underTest.adoptVirtualPet(pet1);
		underTest.adoptVirtualPet(pet1);
		VirtualPet retrievedPet = underTest.findPet(pet1.getPetName());
	}

	@Test
	public void shouldReturnPetNumberInShelter() {
		VirtualPet underTest = new VirtualPet("Joey", 83, 34, 23, "");
		int number = underTest.getNumber();
		assertEquals(2, number);
	}

	public void shouldFeedAllPets() {
		// Act
		underTest.addVirtualPet(pet1);
		underTest.addVirtualPet(pet2);
		Collection<VirtualPet> allPets = underTest.getAllPets();
		int pet1HungerLevelStart = pet1.getHunger();
		underTest.feedAll(allPets, 1);
		int pet1HungerLevelEnd = pet1.getHunger();
		// Assert
		assertEquals(pet1HungerLevelEnd, pet1HungerLevelStart - 1);
	}

	public void shouldWaterAllPets() {
		// Act
		underTest.addVirtualPet(pet1);
		underTest.addVirtualPet(pet2);
		Collection<VirtualPet> allPets = underTest.getAllPets();
		int pet1ThirstLevelStart = pet1.getThirst();
		underTest.waterAll(allPets, 3);
		int pet1HungerLevelEnd = pet1.getThirst();
		// Assert
		assertEquals(pet1HungerLevelEnd, pet1ThirstLevelStart - 3);
	}

	public void shouldPlaywithOnePetInSheltertoBoredomLevel2() {
		// Act
		underTest.addVirtualPet(pet1);
		underTest.addVirtualPet(pet2);
		int twinkleBoredomLevelStart = pet1.getBoredom();
		underTest.playWith("Twinkle", 1);
		int twinkleBoredomLevelEnd = pet1.getBoredom();
		// Asset
		assertEquals(twinkleBoredomLevelEnd, twinkleBoredomLevelStart - 2);
	}
}