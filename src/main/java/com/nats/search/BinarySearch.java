package com.nats.search;

public class BinarySearch {
	
	public static void main(String[] args) {
//		System.out.println(new BinarySearch().binarySearch(new int[] {2,3,4,5,6,7,8}, 4));
		System.out.println(new BinarySearch().binarySearchRec(new int[] {2,3,4,5,6,7,8},0,6, 9));
	}
	
	public int binarySearch(int [] array, int key) {
		int high = array.length-1;
		int low = 0;
		while (low<high) {
			int mid =(low+high)>>1;
			if (key>array[mid]) {
				low=mid+1;
			} else if(key<array[mid]) {
				high=mid;
			}
			if (key==array[mid]) {
				return mid;
			}
		}
		return -1;
	}
	
	public int binarySearchRec(int [] array,int low, int high, int key) {		
		int mid =(low+high)>>1;
		if (low>=high && array[mid] != key ) {
			return -1;
		} 
		if (array[mid] == key) {
			return mid;
		}
			if (key>array[mid]) {
				return binarySearchRec(array,mid+1,high,key);
			} else if(key<array[mid]) {
				return binarySearchRec(array, low, mid, key);
			}
		return -1;		
	}

}
