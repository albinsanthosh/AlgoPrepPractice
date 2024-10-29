package found_Arrays2;

import java.util.Scanner;

public class ReversePartOfArray {

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
	
	public static void main(String[] args) { 
		// input - N size, nums array, st start, en end
		
		Scanner s=new Scanner(System.in);
		int N = s.nextInt();
		int nums[]=new int[N];
		
		for(int i=0; i<N; i++) {
			nums[i]=s.nextInt();
		}
		
		int st = s.nextInt();
		int en = s.nextInt();
		
		reverse(nums, st, en);
		
		for(int i=0; i<N; i++) {
			System.out.print(nums[i] + " ");
		}

	}

}
