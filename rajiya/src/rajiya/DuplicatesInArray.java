package rajiya;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * * Java Program to find duplicate elements in an array. There are two straight
 * * forward solution of this problem first, brute force way and second by using
 * * HashSet data structure. A third solution, similar to second one is by using
 * * hash table data structure e.g. HashMap to store count of each element and *
 * print element with count 1. * * @author java67
 */
public class DuplicatesInArray {public static void main(String[] args) {
	 
	int arr[] = { 14, 46, 47, 86, 92, 52, 48, 36, 66, 85 };
	int largest = arr[0];
	int secondLargest = arr[0];
	
	System.out.println("The given array is:" );
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]+"\t");
	}
	for (int i = 0; i < arr.length; i++) {

		if (arr[i] > largest) {
			secondLargest = largest;
			largest = arr[i];

		} else if (arr[i] > secondLargest) {
			secondLargest = arr[i];

		}
	}

	System.out.println("\nSecond largest number is:" + secondLargest);

}
}


