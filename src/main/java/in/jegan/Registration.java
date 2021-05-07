package in.jegan;

public class Registration {
	
	public String userName;
	public String passWord;
	public Long mobileNumber;
	public String userEmail;
	
	public Registration(String userName , String passWord , Long mobileNumber , String userEmail)
	{
		this.userName = userName;
		this.passWord = passWord;
		this.mobileNumber = mobileNumber;
		this.userEmail= userEmail;
	}
    
	public String toString()
	{
		return "UserName : "+ userName +" PassWord : "+ passWord + " MobileNumber : "+mobileNumber + " UserEmail : "+userEmail;
	}
}
