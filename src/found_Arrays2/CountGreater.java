package found_Arrays2;

import java.util.Scanner;

// Given n length Array, You have to count total no. of elements in the array having atleast 1 element greater than itself.
public class CountGreater {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = s.nextInt();
		}
		
		int count=0;
		for(int i=0; i<n; i++) {
			int current = arr[i];
			for(int j=0; j<n; j++) {
				if(arr[j] > current) {
					count++;
					break;
				}
			}
		}
		
		System.out.println(count);
	}

}
