package orubele.java.fundamental;

import java.util.Scanner;

public class PrintBinary {
	/*
	 * Today, we're working with binary numbers. Check out the Tutorial tab for
	 * learning materials and an instructional video!
	 * 
	 * Task Given a base- integer, , convert it to binary (base-). Then find and
	 * print the base- integer denoting the maximum number of consecutive 's in
	 * 
	 * 's binary representation.
	 * 
	 * Input Format
	 * 
	 * A single integer,
	 * 
	 * .
	 * 
	 * Constraints
	 */


	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);

		System.out.println("Enter a number to print the binary of that number");
		String userResponse = userInput.nextLine();

		int binaryNumber = Integer.parseInt(userResponse);

		int count = 0;
		int remainder = 0;
		int total = 0;

		while (binaryNumber > 0) {
			remainder = (binaryNumber % 2);
			binaryNumber = (binaryNumber / 2);
			if (remainder == 1) {
				count++;
				if (count >= total) {
					total = count;
				}

			} else {
				count = 0;
			}
		}

		System.out.println(total);

	}

}
