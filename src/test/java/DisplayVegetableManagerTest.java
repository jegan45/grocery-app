import org.junit.Test;

import in.jegan.Vegetable;
import in.jegan.VegetableManager;

public class DisplayVegetableManagerTest {

	/**
	 * This method is used test display vegetable list
	 */
	@Test
	public void displayVegetables()
	{
		Vegetable vegetable1 = new Vegetable("Tomato", 50, 25);
		Vegetable vegetable2 = new Vegetable("Potato",30,15);
		VegetableManager.addVegetables(vegetable1);
		VegetableManager.addVegetables(vegetable2);
	     VegetableManager.displayVegetable();
	     
		
	}
}
