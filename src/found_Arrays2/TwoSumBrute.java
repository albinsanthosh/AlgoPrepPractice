package found_Arrays2;

import java.util.Scanner;

//Given n length array "arr" and an integer k, Check if there exists a pair(i,j) such that arr[i]+arr[j] == k and i!=j
public class TwoSumBrute {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i]=s.nextInt();
		}
		
		int k = s.nextInt();
		
		boolean exists = false;

		for(int i=0; i<n; i++) {
			
			for(int j=0; j<n; j++) {
				if((arr[i]+arr[j]) == k && i!=j)
					exists = true;
			}
		}
		
		System.out.println(exists);
	}

}
