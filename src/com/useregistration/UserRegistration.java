package com.useregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	public static void main(String[] args)
	{
		System.out.println("WELCOME TO USER REGISTRATION PAGE");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name:");
		String firstname = sc.nextLine();
		System.out.println("Enter Last Name:\n ");
		String lastname = sc.nextLine();
		validateFirstName(firstname);
		validateLastName(lastname);
	}
	static void validateFirstName(String firstname)
	{
		String regexPattern = "^[A-Z][a-z]{2,}$";
		Pattern p = Pattern.compile(regexPattern);
		Matcher m = p.matcher(firstname);
		if(m.matches())
			System.out.println("Valid First Name");
		else
			System.out.println("Invalid First Name");
	}
	static void validateLastName(String lastname)
   {
      String regexPattern = "^[A-Z][a-z]{2,}$";
      Pattern p = Pattern.compile(regexPattern);
      Matcher m = p.matcher(lastname);
      if(m.matches())
         System.out.println("Valid Last Name");
      else
         System.out.println("Invalid Last Name");
   }
}
