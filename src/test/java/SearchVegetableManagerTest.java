import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import in.jegan.Vegetable;
import in.jegan.VegetableManager;

public class SearchVegetableManagerTest {

	/**
	 * This method is used to test null input
	 */
	@Test
	public void testForNullInput()
	{
		boolean search = VegetableManager.searchVegetable(null);
		assertFalse(search);
	}
	
	/**
	 * This method is used to test valid input
	 */
	@Test
	public void testForValidInput()
	{
		Vegetable vegetable = new Vegetable("Tomato",50,25);
		VegetableManager.addVegetables(vegetable);
		boolean search = VegetableManager.searchVegetable("Tomato");
		assertTrue(search);

	}
	
	/**
	 * This method is used to test invalid empty string
	 */
	@Test
	public void testForEmptyInvalidInput()
	{
		Vegetable vegetable = new Vegetable("Tomato",50,25);
		VegetableManager.addVegetables(vegetable);
		boolean search = VegetableManager.searchVegetable(" ");
		assertFalse(search);

	}
	
	/**
	 * This method is used to test incorrect vegetable name
	 */
	@Test
	public void testForIncorrectInput()
	{
		Vegetable vegetable = new Vegetable("Tomato",50,25);
		VegetableManager.addVegetables(vegetable);
		boolean search = VegetableManager.searchVegetable("Carrot");
		assertFalse(search);

	}
}
