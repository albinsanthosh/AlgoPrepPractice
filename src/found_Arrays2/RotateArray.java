package found_Arrays2;

import java.util.Scanner;

public class RotateArray {
	
	public static void reverse( int arr[], int st, int en) { 
		int sp=st;
		int ep=en;
		while(sp<ep) {
			int temp = arr[sp];
			arr[sp] = arr[ep];
			arr[ep] = temp;
			sp++;
			ep--;
		}
	}
	
	public static void rotate(int s, int arr[], int steps) { 
		reverse(arr, 0, s-1);
		reverse(arr, 0, steps-1);
		reverse(arr, steps, s-1);
	}
	
	public static void main(String[] args) { 
		// input - N size, nums array, k steps
		
		Scanner s=new Scanner(System.in);
		int N = s.nextInt();
		int nums[]=new int[N];
		
		for(int i=0; i<N; i++) {
			nums[i]=s.nextInt();
		}
		
		int k = s.nextInt();
		k = k % N; // use k = k%n otherwise show runtime error.. its due to when n < k .
		
		rotate(N, nums, k);
		
		for(int i=0; i<N; i++) {
			System.out.print(nums[i] + " ");
		}

	}
}
