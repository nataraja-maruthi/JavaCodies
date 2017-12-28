package com.nats.search;

public class LinearSearch {
	
	public static void main(String[] args) {
		System.out.println(new LinearSearch().linearSearch(new int[] {2,3,4,5,6,7,8}, 4));
	}

	private int linearSearch(int[] array, int key) {
		for (int j = 0; j < array.length; j++) {
			if (key==array[j]) {
				return j;
			}
		}
		return -1;
	}

}
