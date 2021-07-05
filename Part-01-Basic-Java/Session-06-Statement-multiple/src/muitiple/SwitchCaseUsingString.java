package muitiple;

import java.util.Scanner;

public class SwitchCaseUsingString {

	public static void main(String[] args) {

		String fruit;
		System.out.println("A. Apple B. Banana M.Mango ");
		Scanner sc = new Scanner(System.in);

		fruit = sc.next();

		switch (fruit) {

		case "a":
			System.out.println("You have purchase Apple");
			break;

		case "b":
			System.out.println("You have purchased Banana");
			break;
		case "m":
			System.out.println("You have Purchased Mango");
			break;
		default:
			System.out.println(" Invalid Choice ");

		}

		System.out.println();
	}

}
