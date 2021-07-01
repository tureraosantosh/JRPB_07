package basic;

public class Student {
	
	private String name;

	public void fillValueToNameVariable(String n)
	{
		//checking security
		
		name=n;
	}
	
	public void setEmail(String e)
	{
		email=e;
	}
	public void setMobile(String m)
	{
		mobile=m;
	}
	private String email;
	private String mobile;
	
	//Encapsulation.
	
	//this data should not available to read or write directly by another class
	//1public 2 private 3 protected 4 default
	public void setAtmPin(String a)
	{
		atmPin=a;
	}
   private	String atmPin;
	
	
	public void display()
	{
		System.out.println("Name :: "+name);
		System.out.println("Email :: "+email);
		System.out.println("mobile :: "+mobile);
		System.out.println("Pin :: "+atmPin);
		
	}

}
