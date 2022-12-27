package com.bridgelabz.userregistrationusinglambda;
/*
 * ProblemStatement - UC13 Refactor the Code to use Lambda Function to validate User Entry
 * - Use Lambda Function to validate First Name, Last Name, Email, Mobile, and Password
 */
import java.util.regex.Pattern;
public class UserRegistration {
	@FunctionalInterface
	interface Validation {
		public String validate(String regex, String userDetails);
	}
		//method create for refactor the code.
	public static void validUserEntry() {
		Validation isValidFirstName = (pattern, firstName) -> {
			return "First Name is " + Pattern.compile(pattern).matcher(firstName).matches();
		};
		System.out.println(isValidFirstName.validate("^[A-Z]{1}[a-z]{2,}$", "Pallavi"));

		Validation isValidLastName = (pattern, firstName) -> {
			return "Last Name is " + Pattern.compile(pattern).matcher(firstName).matches();
		};
		System.out.println(isValidLastName.validate("^[A-Z]{1}[a-z]{2,}$", "Chedge"));

		Validation isValidEmail = (pattern, email) -> {
			return "Email is " + Pattern.compile(pattern).matcher(email).matches();
		};
		System.out.println(isValidEmail.validate("^[a-z]+[+-_.]*[a-z]*[@][a-z]+[.][a-z]{2,4}[.]*([a-z]{2})*$",
				"abc.xyz@bl.co.in"));

		Validation isValidMobileNumber = (pattern, mobileNumber) -> {
			return "Mobile number is " + Pattern.compile(pattern).matcher(mobileNumber).matches();
		};
		System.out.println(isValidMobileNumber.validate("^[91]+[ ]?[6-9]{1}[0-9]{9}$", "91 9919819801"));

		Validation isValidPasswordRule1 = (pattern, password) -> {
			return "Password First is " + Pattern.compile(pattern).matcher(password).matches();
		};
		System.out.println(isValidPasswordRule1.validate("^[a-z]{8,}$", "jfydkebh"));

		Validation isValidPasswordRule2 = (pattern, password) -> {
			return "Password Second is " + Pattern.compile(pattern).matcher(password).matches();
		};
		System.out.println(isValidPasswordRule2.validate("^[a-z](?=.*[A-Z]).{8,}$", "jnkjjcnclP"));

		Validation isValidPasswordRule3 = (pattern, password) -> {
			return "Password Third is " + Pattern.compile(pattern).matcher(password).matches();
		};
		System.out.println(isValidPasswordRule3.validate("^[a-z](?=.*[A-Z]+)(?=.*[0-9]+).{8,}$", "jnkjPabc9"));

		Validation isValidPasswordRule4 = (pattern, password) -> {
			return "Password Fourth is " + Pattern.compile(pattern).matcher(password).matches();
		};
		System.out.println(isValidPasswordRule4.validate("^[0-9a-zA-Z!,@#$&*().]{8,}$", "prn@11abc"));
	}
	//main method
	public static void main(String[] args) {
		validUserEntry();
	}
}
