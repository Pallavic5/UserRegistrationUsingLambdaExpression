package com.bridgelabz.userregistrationusinglambda;
/*
 * Problem Statement UC4 As a User need to follow pre-defined
Mobile Format - E.g. 91 9919819801 
- Country code follow by space and 10 digit number
 */
import java.util.regex.Pattern;

public class UserRegistration {

	@FunctionalInterface
	interface Validation {
		public String validate(String regex, String userDetails);
	}

	/*
	 * () -> {} (This is the Lambda Expression structure)
	 */
	public static void validFirstName() {
		Validation isValidFirstName = (pattern, firstName) -> {
			return "First Name is " + Pattern.compile(pattern).matcher(firstName).matches();
		};
		System.out.println(isValidFirstName.validate("^[A-Z]{1}[a-z]{2,}$", "Pallavi"));
	}

	public static void validLastName() {
		Validation isValidLastName = (pattern, firstName) -> {
			return "Last Name is " + Pattern.compile(pattern).matcher(firstName).matches();
		};
		System.out.println(isValidLastName.validate("^[A-Z]{1}[a-z]{2,}$", "Chedge"));
	}

	public static void validEmail() {
		Validation isValidEmail = (pattern, email) -> {
			return "Email is " + Pattern.compile(pattern).matcher(email).matches();
		};
		System.out.println(isValidEmail.validate("^[a-z]+[+-_.]*[a-z]*[@][a-z]+[.][a-z]{2,4}[.]*([a-z]{2})*$",
				"abc.xyz@bl.co.in"));
	}

	public static void validMobileNumber() {
		Validation isValidMobileNumber = (pattern, mobileNumber) -> {
			return "Mobile number is " + Pattern.compile(pattern).matcher(mobileNumber).matches();
		};
		System.out.println(isValidMobileNumber.validate("^[91]+[ ]?[6-9]{1}[0-9]{9}$", "91 9919819801"));
	}
	// main method
	public static void main(String[] args) {
		System.out.println("Welcome to User Registration Problem using Lambda Expression");
		/*
		 * method calling
		 */
		validFirstName();
		validLastName();
		validEmail();
		validMobileNumber();
	}

}
