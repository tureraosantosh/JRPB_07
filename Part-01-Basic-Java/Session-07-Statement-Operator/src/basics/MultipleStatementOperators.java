package basics;

public class MultipleStatementOperators {

	public static void main(String[] args) {

		int sub1, sub2, sub3;
		sub1 = 31;
		sub2 = 33;
		sub3 = 35;
		/**
		 * and && Operator Example
		 */
		if (sub1 > 32 && sub2 > 32 && sub3 > 32) {
			System.out.println("Passed");
		} else {
			System.out.println("AT KT ");
		}

		// equals
		String ch = "a";

		if ("a".equals(ch) || "e".equals(ch) || "i".equals(ch)) {
			System.out.println("give char is Vowel");
		} else {
			System.out.println("given char is consonent ");
		}
		
		/**
		 * 
		 */
		
		String name,email,address;
		
		name="santosh";
		email="santosh@gmail.com";
		address="navi mumbai";
	
		
		if(name.isEmpty())
		{
			System.out.println("name is empty this is mandatory filled ");
		}
		
		if(email.isEmpty())
		{
			System.out.println("email is empty this is mandatory filled ");
		}
		
		if(address.isEmpty())
		{
			System.out.println("address is empty this is mandatory filled ");
		}
	}

}
