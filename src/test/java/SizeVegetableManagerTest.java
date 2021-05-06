import static org.junit.Assert.assertEquals;
import org.junit.Test;

import in.jegan.Vegetable;
import in.jegan.VegetableManager;

public class SizeVegetableManagerTest {
    
	/**
	 * This method is used to test the correct size
	 */
	@Test
	public void testgetSize()
	{
		Vegetable vegetable1=new Vegetable("tomato",50,25);						
		VegetableManager.addVegetables(vegetable1);
		int size= VegetableManager.getSize();
		assertEquals(1, size);
	}
    
	@Test
	public void testForNullInput()
	{
		/*
		 * In above method(testgetSize()) already one vegetable object is added to vegetableList but here null object will not be added
		 */
		System.out.println("Vegetable count : " + VegetableManager.getSize());
		Vegetable vegetable1=new Vegetable(null,50,25);						
		VegetableManager.addVegetables(vegetable1);
		int size= VegetableManager.getSize();
		assertEquals(1, size);
	}
	
	@Test
	public void testForInvalidEmptyInput()
	{
		/*
		 * In above method(testgetSize()) already one vegetable object is added to vegetableList but here empty string  will not be added
		 */
		Vegetable vegetable1=new Vegetable(" ",50,25);						
		VegetableManager.addVegetables(vegetable1);
		int size= VegetableManager.getSize();
		assertEquals(1, size);

	}
}
