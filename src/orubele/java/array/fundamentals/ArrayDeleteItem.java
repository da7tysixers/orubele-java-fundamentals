package orubele.java.array.fundamentals;

import java.awt.List;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayDeleteItem {
	public static void main(String[] args) {

		// Demonstrate my knowledge of a fixed array of size N.
		//
		Scanner scan = new Scanner(System.in);

		long[] arr; // array of long.
		int nelement = 0; // number of elements saved saved in the array
		arr = new long[10];

		arr[0] = 77;
		arr[1] = 99;
		arr[2] = 44;
		arr[3] = 55;
		arr[4] = 22;
		arr[5] = 88;
		arr[6] = 11;
		arr[7] = 00;
		arr[8] = 66;
		arr[9] = 33;

		nelement = 10;
		System.out.println("Enter a number to search in the array");
		long searchKey = scan.nextLong();
		

		for (int i = 0; i < nelement; i++) {
			if (arr[i] == searchKey) {
				break;
			}

			for (int j = i; j < nelement - 1; j++) {
				arr[j] = arr[j + 1];

				nelement--;

			}

		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		
	}
}