package muitiple;

public class MutilpleConditions {
	
	public static void main(String[] args) {
		
		int mark=81;
		
		if(mark>90)
		{
			System.out.println("Passed With A grade");
		}
		else if(mark>75)
		{
			System.out.println("passed with B grade");
		}
		else if(mark>60)
		{
			System.out.println("Passed With C grade");
		}
		else if(mark>40)
		{
			System.out.println("Passed");
		}
		else 
		{
			System.out.println("Failed");
		}
	}

}
