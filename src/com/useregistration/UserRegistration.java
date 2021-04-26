package com.useregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	public static void main(String[] args)
	{
		System.out.println("WELCOME TO USER REGISTRATION PAGE");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name: ");
		String firstname = sc.nextLine();
		System.out.println("Enter Last Name: ");
		String lastname = sc.nextLine();
		System.out.println("Enter e-mail Address: ");
		String email = sc.nextLine();
		System.out.println("Enter Mobile Number: ");
		String phno = sc.nextLine();
		System.out.println("Enter Password: ");
		String pswd = sc.nextLine();
		validateFirstName(firstname);
		validateLastName(lastname);
		validateEmail(email);
		validateMobileNumber(phno);
		validatePassword(pswd);
		System.out.println("All Email Samples Provided are Validated");
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
	static void validateEmail(String email)
	{
		String regexPattern = "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?$";
		Pattern p = Pattern.compile(regexPattern);
		Matcher m = p.matcher(email);
		if(m.matches())
			System.out.println("Valid e-mail Address");
		else
			System.out.println("Invalid e-mail Address");
	}
	static void validateMobileNumber(String phno)
	{
		String regexPattern = "^(91){1}[ ][6-9]{1}[0-9]{9,9}$";
		Pattern p = Pattern.compile(regexPattern);
		Matcher m = p.matcher(phno);
		if(m.matches())
			System.out.println("Valid Mobile Number");
		else
			System.out.println("Invalid Mobile Number");
	}
	static void validatePassword(String pswd)
	{
		String regexPattern = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,20}$";
		Pattern p = Pattern.compile(regexPattern);
		Matcher m = p.matcher(pswd);
		if(m.matches())
			System.out.println("Valid Password");
		else
			System.out.println("Invalid Password");
	}
}
