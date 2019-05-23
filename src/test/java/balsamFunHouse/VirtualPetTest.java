package balsamFunHouse;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VirtualPetTest {

	@Test
	public void shouldReturnPetName() {
		VirtualPet underTest = new VirtualPet("Joey", 83, 34, 23, " ");
		String PetName = underTest.getPetName();
		assertEquals("Joey", PetName);
	}

	@Test
	public void shouldReturnPetDescription() {
		VirtualPet underTest = new VirtualPet("", 83, 34, 23, "Looks like he's seen better days");
		String PetDescription = underTest.getPetDescription();
		assertEquals("Looks like he's seen better days", PetDescription);
	}

	@Test
	public void shouldReturnHungerLevel() {
		VirtualPet underTest = new VirtualPet("", 83, 34, 23, "");
		int hunger = underTest.getHunger();
		assertEquals(83, hunger);
	}

	@Test
	public void shouldReturnThirstLevel() {
		VirtualPet underTest = new VirtualPet("", 83, 34, 23, " ");
		int thirst = underTest.getThirst();
		assertEquals(34, thirst);
	}

	@Test
	public void ShouldReturnBoredomLevel() {
		VirtualPet underTest = new VirtualPet("", 83, 34, 23, "");
		int boredom = underTest.getBoredom();
		assertEquals(23, boredom);
	}
}
