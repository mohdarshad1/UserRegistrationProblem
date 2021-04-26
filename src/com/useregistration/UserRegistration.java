package com.useregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	public static void main(String[] args)
	{
		System.out.println("WELCOME TO USER REGISTRATION PAGE");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First name: ");
		String FirstName = sc.nextLine();
		String regexPattern = "^[A-Z][a-z]{2,}$";
		Pattern p = Pattern.compile(regexPattern);
		Matcher m = p.matcher(FirstName);
		if(m.matches())
			System.out.println("First Name is Valid");
		else
			System.out.println("First Name is Invalid");
	}
}
