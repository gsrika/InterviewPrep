package com.interviewprep.recursion;

public class BinarySearch {
	
	public static boolean BinarySearch(int a[], int element) {
		int low = 0;
		int high = a.length-1;
		while (low <= high) {
			int mid = (low + high) /2;
			int val = a[mid];
			if ( element < val) {
				high = mid -1;
			}
			else if(element > val) {
				low = mid + 1;
			}
			else {
				return true;
			}
		}
		
		return false;
	}
	
	public static void main(String args[]) {
		int a[] = {1,2,4,6};
		System.out.println(BinarySearch(a, 2));
	}

}
