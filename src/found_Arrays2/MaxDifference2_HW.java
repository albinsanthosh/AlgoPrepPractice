package found_Arrays2;

import java.util.Scanner;

/*
 * Given n length array "arr". 
 * Find (i,j) with maximum value of arr[i] - arr[j] + i - j. 
 * You need to print max value of (arr[i] - arr[j] + i - j) possible 
 * and not the (i,j) itself.
 */
public class MaxDifference2_HW {

	public static void main(String args[]) {
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		int arr[]=new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i]=s.nextInt();
		}
		
		System.out.println(maxDifference2(arr));
	}

	private static int maxDifference2(int[] arr) {
		
		int lg=Integer.MIN_VALUE, sm=Integer.MAX_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = arr[i] + i;
		}
		
		for(int i=0; i<arr.length; i++) {
			if(lg < arr[i]) {
				lg = arr[i];
			}
			if(sm > arr[i]) {
				sm = arr[i];
			}
		}
		
		return lg - sm;
	}
}
