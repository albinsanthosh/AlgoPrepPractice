package found_Arrays2;

import java.util.Scanner;

/*
 * Given n length array "arr". 
 * Find the pair with maximum value of arr[i] - arr[j]. 
 * You need to print max value of (arr[i] - arr[j]) possible 
 * and not the (i,j) itself.
 */
public class MaxDifference1_HW {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		int arr[]=new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i]=s.nextInt();
		}
		
		int smallest=arr[0], largest=arr[0], max;
				
		for(int i=0; i<n; i++) {
			if(arr[i]<smallest) {
				smallest = arr[i];
			}
			if(arr[i]>largest) {
				largest = arr[i];
			}
		}
		max = largest - smallest;
		System.out.println(max);
		
		//System.out.println("Max value: " + max);
		//System.out.println("Max value pair: " + smallest + ", " + largest);
		
	}

}
