package Osrs;

import java.util.*;

public class BinaryCalc {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// ask user for base for conversion
		System.out.println(
				"Type in your base (all lower case no spaces) for conversion. type: binary, decimal, or hexadecimal");
		String base = scanner.nextLine();

		System.out.println("You've entered: " + base);

		if (base.equals("binary")) {
			System.out.println("Enter Binary Number(no spaces must be 8 numbers 1-0):");
			String num = scanner.nextLine();
			int length = num.length();
			// make sure proper binary number is entered 01's only and 8 digits
			if ( num.matches("[01]+") && length == 8) {
				// to decimal
				int decimal = Integer.parseInt(num, 2);
				System.out.println("the binary number: " + num + " converted to decimal is " + decimal);
				// to hexadecimal
				String hexStr = Integer.toString(decimal, 16);
				//hex needs to be in caps
				String cap = hexStr.toUpperCase();
				System.out.println("the binary number: " + num + " converted to hexadecimal is " + cap);

			} else {
				System.out.println("input was incorrect binary form.");
			}

		}

		else if (base.equals("decimal")) {
			System.out.println("Enter Decimal Number(no spaces):");
			int num = scanner.nextInt();
			// convert decimal to string to check for invalid inputs
			String number = Integer.toString(num);
			// if statement to check if decimal is 0-9 numbers and does not start with 0
			if (num <= 255 && num > 0 && number.matches("[0123456789]+")) {
				// to binary
				System.out.println("The decimal: " + num + " converted to binary is " + Integer.toBinaryString(num));
				// to hexadecimal
				String numm = Integer.toHexString(num);
				//output needs to be in caps
				String cap = numm.toUpperCase();
				System.out.println("The decimal: " + num + " converted to hexadecimal is " + cap);

			} else {
				System.out.println("input was incorrect decimal form.");
			}
		}

		else if (base.equals("hexadecimal")) {
			System.out.println("Enter Hexadecimal Number(no spaces enter only two numbers or capital letters):");
			String num = scanner.nextLine();
			int length = num.length();
			// error checking for numbers 0-9 and cap letters A-F
			if (num.matches("[0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ]+") && length == 2 ) {
				// to decimal
				int decimal = Integer.parseInt(num, 16);
				System.out.println("The hexadecimal: " + num + " converted to decimal is " + decimal);
				// to binary
				String binary = Integer.toBinaryString(decimal);
				System.out.println("The hexadecimal: " + num + " converted to binary is " + binary);

			} else {
				System.out.println("input was incorrect hexadecimal form.");
			}

		} else {

			System.out.println("input error: base must be binary, decimal, or hexadecimal");
			System.exit(0);
		}

	}
}
