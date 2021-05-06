import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import in.jegan.Vegetable;
import in.jegan.VegetableManager;

public class DeleteVegetableManagerTest {
	
	/**
	 * This method is used to test valid input
	 */
	@Test
	public void testForValidInput()
	{
		Vegetable vegetable = new Vegetable("Tomato",50,25);
		VegetableManager.addVegetables(vegetable);
		boolean deleted = VegetableManager.deleteVegetable("Tomato");
		assertTrue(deleted);
	}
    
	/**
	 * This method is used to test null input
	 */
	@Test
	public void testForNullInvalidInput()
	{
		Vegetable vegetable = new Vegetable("Tomato",50,25);
		VegetableManager.addVegetables(vegetable);
		boolean deleted = VegetableManager.deleteVegetable(null);
		assertFalse(deleted);
	}
	
	/**
	 * This method is used to test invalid empty string
	 */
	@Test
	public void testForEmptyInvalidInput()
	{
		Vegetable vegetable = new Vegetable("Tomato",50,25);
		VegetableManager.addVegetables(vegetable);
		boolean deleted = VegetableManager.deleteVegetable(" ");
		assertFalse(deleted);
	}
	
	/**
	 * This method is used to test incorrect vegetable name
	 */
	@Test
	public void testForIncorrectInput()
	{
		Vegetable vegetable = new Vegetable("Tomato",50,25);
		VegetableManager.addVegetables(vegetable);
		boolean deleted = VegetableManager.deleteVegetable("Carrot");
		assertFalse(deleted);
	}
}
