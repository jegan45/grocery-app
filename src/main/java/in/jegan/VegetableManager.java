package in.jegan;

import java.util.ArrayList;

public class VegetableManager {
	
	public  static ArrayList<Vegetable> vegetableList = new ArrayList<Vegetable>();

	/**
	 * This method is used to add vegetables and returns true only the given conditions are true otherwise returns false
	 * @param vegetable
	 * @return
	 */
	public static boolean addVegetables(Vegetable vegetable)
	{
		boolean added = false;
		try {
			if(vegetable.vegetableName != null && vegetable.vegetableName.trim()!="" && vegetable.vegetableName.matches("^[a-zA-Z]*$")  && vegetable.price > 0 && vegetable.price != 0 && vegetable.quantity > 0 && vegetable.quantity != null)
			{
				vegetableList.add(vegetable);
				 added=true;
			}
		} catch (Exception e) {
			added=false;
		}

		return added;
	}
	
	/**
	 * This method returns size of the vegetableList
	 * @return
	 */
	public static int getSize()
	{
		return vegetableList.size();
		
	}
	
	/**
	 * This method is used to search vegetables using boolean name called searched
	 * @param vegetableName
	 * @return
	 */
	public static boolean searchVegetable(String vegetableName)
	{
		boolean searched = false;
		for(Vegetable vegetable : vegetableList)
		{
			if(vegetable.vegetableName.equals(vegetableName))
			{
			   searched = true;
			   break;
			}
		}
		return searched;
	}
	
	/**
	 * This method is used get the index of vegetables 
	 * @param vegetableName
	 * @return
	 */
	public static int getVegetableIndex(String vegetableName)
	{
		int index=-1;
		for(Vegetable vegetable : vegetableList)
		{
			if(vegetable.vegetableName.equals(vegetableName))
			{
			   index=vegetableList.indexOf(vegetable);
			   break;
			}
		}
		return index;
		
	}
	
	/**
	 * This method is used for display the vegetableList
	 */
	public static void displayVegetable()
	{
		System.out.println("------List Of Vegetables-----");
		for(Vegetable vegName : vegetableList)
		{
		   System.out.println(vegName);
		}
	}
	
	/**
	 * This method is used to delete to vegetable
	 * @param vegetableName
	 * @return
	 */
	public static boolean deleteVegetable(String vegetableName)
	{
		boolean isRemoved = false;
		int index=getVegetableIndex(vegetableName);
		if(index != -1)
		{
			vegetableList.remove(vegetableName);
			isRemoved = true;
		}
		return isRemoved;
	}
}
