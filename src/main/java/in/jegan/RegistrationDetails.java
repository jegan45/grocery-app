package in.jegan;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class RegistrationDetails {
	
	public  static ArrayList<Registration> userDetails = new ArrayList<Registration>();
	
	/**
	 * Adding userDetails to the userDetails list
	 * @param registration
	 * @return
	 */
	public static boolean addUser(Registration registration) {
		boolean validUser = false;
		boolean validUserName = validateUserName(registration);
		boolean validPassword = validateUserPassWord(registration);
		boolean validMobileNumber = validateUserMobileNumber(registration);
		boolean validEmail = validateUserEmail(registration);

		if (validUserName && validPassword && validEmail && validMobileNumber) 
		{
			userDetails.add(registration);
			validUser = true;
		}
		return validUser;
	}
	
	/**
	 * This method is used for validating userName 
	 * @param registration
	 * @return
	 */
	public static boolean validateUserName(Registration registration)
	{
		boolean added= false;
		int NoOfCharactersInUserName= 25;
		try
		{
			int userNamelength = getLength(registration.userName);
			if(registration.userName != null  && registration.userName.trim()!="" && registration.userName.matches("^[a-zA-Z0-9]*$") && userNamelength <= NoOfCharactersInUserName)
			{
				added = true;
			}
		}
		catch (Exception e) {
			added = false;
		}
		return added;	
	}
    
	/**
	 * This method is used for getting the length of particular String
	 * @param string
	 * @return
	 */
	private static int getLength(String string) {
		return string.length();
	}
    
	/**
	 * This method is used for validating user password
	 * @param registration
	 * @return
	 */
	public static boolean validateUserPassWord(Registration registration)
	{
		boolean checkPassWord = false;
		try
		{
			String passWordType = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,}$";
			boolean checkPassWordType = Pattern.matches(passWordType, registration.passWord);
			if(registration.passWord != null && registration.passWord.trim() !="" && checkPassWordType)
			{
			    checkPassWord = true;
			}
		}
		catch (Exception e) {
			checkPassWord = false;
		}
		return checkPassWord;
		
	}
	
	/**
	 * This method is used for validating user mobileNumber
	 * @param registration
	 * @return
	 */
    public static boolean validateUserMobileNumber(Registration registration)
    {
    	boolean checkMobileNumber = false;
    	try
    	{
    		String mobileNumber = Long.toString(registration.mobileNumber);
    		String mobileNumberType = "[[0][91]]{1,2}[6-9]{2}[0-9]{8}";
   
    		boolean checkMobileNumberType = Pattern.matches(mobileNumberType, mobileNumber);
    		if(registration.mobileNumber != null && registration.mobileNumber.toString().trim() != "" && checkMobileNumberType)
    		{
    			checkMobileNumber = true;
    		}
    	}
    	catch (Exception e) {
			checkMobileNumber = false;
		}
		return checkMobileNumber;
    	
    }
    
    /**
     * This method is used for validating user email
     * @param registration
     * @return
     */
	public static boolean validateUserEmail(Registration registration)
	{
		boolean checkEmail = false;
		try
		{
			String emailType = "^[a-zA-Z0-9_+&*-.]+@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
			boolean checkEmailType = Pattern.matches(emailType,  registration.userEmail);
			if(registration.userEmail != null && registration.userEmail.trim() != "" && checkEmailType)
			{
				checkEmail = true;
			}
		}
		catch (Exception e) {
			checkEmail = false;
		}
		return checkEmail;
		
	}
	
	public static int getSize()
	{
		return userDetails.size();
		
	}
	
	/**
	 * This method is used for displaying the user details
	 */
	public static void displayUserDetails()
	{
		System.out.println("---------List of UserDetails---------");
		for(Registration userDetails : userDetails)
		{
			System.out.println(userDetails);
		}
	}
}
