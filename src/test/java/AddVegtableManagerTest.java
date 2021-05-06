import static org.junit.Assert.*;
import static org.junit.Assume.assumeFalse;

import java.util.ArrayList;

import org.junit.Test;

import in.jegan.Vegetable;
import in.jegan.VegetableManager;

public class AddVegtableManagerTest {
    /**
     * This method is used to test the valid input and adds to vegetableList
     */
	@Test
	public void testWithValidInput() {
			
		Vegetable vegetable1=new Vegetable("Tomato",50,25);
		Vegetable vegetable2=new Vegetable("Potato",30,15);
		boolean validVegetable1 = VegetableManager.addVegetables(vegetable1);
		boolean validVegetable2 = VegetableManager.addVegetables(vegetable2);
		assertTrue(validVegetable1);
		assertTrue(validVegetable2);
	}
	
	/**
	 * This method is used to check invalid null input list
	 */
	@Test
	public void testWithNullInvalidInput()
	{
		Vegetable vegetable = new Vegetable(null, 50, 25);
		boolean added=VegetableManager.addVegetables(vegetable);
		assertFalse(added);
	}
	
	/**
	 * This method is used to test empty invalid input in list
	 */
	@Test
	public void testWithInvalidEmptyInput()
	{
		Vegetable vegetable = new Vegetable(" ", 50, 25);
		boolean added= VegetableManager.addVegetables(vegetable);
		assertFalse(added);
	}
	
	/**
	 * This method is used to test not numeric value in vegetable name
	 */
	@Test
	public void testForNotNumericInput()
	{
		Vegetable vegetable = new Vegetable("Tomato345", 50, 25);
		boolean added= VegetableManager.addVegetables(vegetable);
		assertFalse(added);

	}
	
	/**
	 * This method is used to testinvalid price
	 */
	@Test
	public void testForInvalidPriceInput()
	{
		Vegetable vegetable = new Vegetable("Tomato", -1, 25);
		boolean added= VegetableManager.addVegetables(vegetable);
		assertFalse(added);
	}
	
	/**
	 * This method is used to test invalid quantity value
	 */
	@Test
	public void testForInvalidquantityInput()
	{
		Vegetable vegetable = new Vegetable("Tomato", 50, -1);
		boolean added= VegetableManager.addVegetables(vegetable);
		assertFalse(added);

	}
	
	}

