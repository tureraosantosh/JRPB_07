package muitiple;

import java.util.Scanner;

public class SwitchCase {
	/**
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		/**
		 * this object is used to get data from user/command line.
		 */
		Scanner  sc=new Scanner(System.in);
		
		int choice;
		
		System.out.println("1.Veg 2.Non-Veg");
		
		choice=1;
		
		switch(choice)
		{
		case 1:
			System.out.println("Your choice is Veg ");
			break;
			
		case 2:
			System.out.println("Your Choice is Non-Veg..");
			break;
		
		}
		
	}

}
