package orubele.java.array.fundamentals;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayApplication {
	public static void main(String[] args) {
		// Demonstrate my knowledge of a fixed array of size N.
		//
		Scanner scan = new Scanner(System.in);
		
		Long[] arr; // array of long.
		int nelement = 0; // number of elements saved saved in the array
		arr = new Long[10];
		
		arr[0] = 77l;
		arr[1] = 99l;
		arr[2] = 44l;
		arr[3] = 55l;
		arr[4] = 22l;
		arr[5] = 88l;
		arr[6] = 11l;
		arr[7] = 00l;
		arr[8] = 66l;
		arr[9] = 33l;
		
		nelement = 10;
		System.out.println("Enter a number to search in the array");
		Long searchKey = scan.nextLong();
		
		List<Long> list = new ArrayList<Long>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == searchKey) {
				continue;
				
			}else {
				if(arr[i] == null) {break;}
				list.add(arr[i]);
			}
			
		}
			
			System.out.println(list);
			
		}
	
		
	}

