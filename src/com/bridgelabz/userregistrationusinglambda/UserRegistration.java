package com.bridgelabz.userregistrationusinglambda;
/*
 * Problem Statement UC2 As a User need to enter a valid Last Name
- First name starts with Cap and has
minimum 3 characters
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
			//main method
	public static void main(String[] args) {
		System.out.println("Welcome to User Registration Problem using Lambda Expression");
		/*
		 * method calling
		 */
		validFirstName();
		validLastName();
	}
}
