package variablesandtypes;

import java.util.Scanner;

public class DetailsProblem {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your FirstName : ");
		String firstName = scan.next();
		
		System.out.println("Enter your LastName : ");
		String lastName = scan.next();
		
		System.out.println("Enter your Mobile Number : ");
		long mobileNumber = scan.nextLong();
		
		System.out.println("Enter your Address : ");
		String address = scan.next();
		
		System.out.println("Enter your Email Id : ");
		String mailId = scan.next();

		System.out.println("Your FirstName is : " + firstName);
		System.out.println("Your LastName is : " + lastName);
		System.out.println("Your Mobile Number is : " + mobileNumber);
		System.out.println("Your Address is : " + address);
		System.out.println("Your Email Id is : " + mailId);
	}

}
