import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import in.jegan.Registration;
import in.jegan.RegistrationDetails;

public class RegistrationDetailsTest {
	
	/**
	 * This method is used to test valid input
	 */
	@Test
	public void addUserDetailsWithValidInputTest()
	{
		Registration registration = new Registration("jegan45","Jegan@123",919698475004L,"jegan@gmail.com");
		boolean added = RegistrationDetails.addUser(registration);
		RegistrationDetails.displayUserDetails();
		assertTrue(added);
	}
    
	/**
	 * This method is used to test Invalid empty string userName
	 */
	@Test
	public void userNameWithInvalidEmptyStringInput()
	{
		Registration registration = new Registration(" ","Jegan@123",919698475004L,"jegan@gmail.com");
		boolean added = RegistrationDetails.addUser(registration);
		assertFalse(added);
	}
	
	/**
	 * This method is used to test invalid null userName
	 */
	@Test
	public void userNameWithInvalidNullInput()
	{
		Registration registration = new Registration(null,"Jegan@123",919698475004L,"jegan@gmail.com");
		boolean added = RegistrationDetails.addUser(registration);
		assertFalse(added);
	}
	
	/**
	 * This method is used to test invalid user password
	 */
	@Test
	public void passWordForInvalidInput()
	{
		Registration registration = new Registration("jegan45","jegan@123",919698475004L,"jegan@gmail.com");
		boolean added = RegistrationDetails.addUser(registration);
		assertFalse(added);
	}
	
	/**
	 * this method is used to test invalid user email 
	 */
	@Test
	public void userEmailForInvalidInput()
	{
		Registration registration = new Registration("jegan45","Jegan@123",919698475004L,"@jegangmail.com");
		boolean added = RegistrationDetails.addUser(registration);
		assertFalse(added);
	}
	
	/**
	 * This method is used to test invalid user mobileNumber
	 */
	@Test
	public void userMobileNumberForInvalidInput()
	{
		Registration registration = new Registration("jegan45","Jegan@123",91-9698475004L,"jegan@gmail.com");
		boolean added = RegistrationDetails.addUser(registration);
		assertFalse(added);
	}
	
	/**
	 * This method is used to test size of userDetails List
	 */
	@Test
	public void getSizeTest()
	{
		Registration registration = new Registration("jegan45","Jegan@17656",919698475004L,"jegan@gmail.com");
		 RegistrationDetails.addUser(registration);
		int size = RegistrationDetails.getSize();
		assertEquals(1, size);
	}
}
