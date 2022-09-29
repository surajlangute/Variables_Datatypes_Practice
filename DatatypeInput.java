package variablesandtypes;

import java.util.Scanner;

public class DatatypeInput {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter INTEGER value  : ");
		int num = scan.nextInt();
		System.out.println("Enter value for SHORT datatype : ");
		short s = scan.nextShort();
		System.out.println("Enter value for LONG datatype: ");
		long ss = scan.nextInt();
		System.out.println("Enter value for BYTE datatype : ");
		byte b = scan.nextByte();
		System.out.println("Enter any NAME   : ");
		String name = scan.next();
		System.out.println("Enter a CHARACTER : ");
		char alpha = scan.next().charAt(0);
		System.out.println("Enter value for FLOAT datatype : ");
		float val = scan.nextFloat();
		System.out.println("Enter Decimal value for DOUBLE datatype :  ");
		double dec = scan.nextDouble();
		System.out.println("Enter 0 : ");
		boolean result = scan.nextBoolean();

		System.out.println("interger : " + num);
		System.out.println("short : " + s);
		System.out.println("long : " + ss);
		System.out.println("string : " + name);
		System.out.println("char : " + alpha);
		System.out.println("float :" + val);
		System.out.println("double : " + dec);
		System.out.println("byte : " + b);
		System.out.println("boolean : " + result);
	}
}
