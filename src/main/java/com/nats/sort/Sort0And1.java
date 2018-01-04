package com.nats.sort;

public class Sort0And1 {
	
	public static void main(String[] args) {
		int[] numbers = {1,1,1,0,0,0};
		int i=0;int j=numbers.length-1;
		while (i<=j) {
			while (numbers[i]==0) {
				i++;
			}
			while (numbers[j]==1) {
				j--;
			}
			if (i<=j) {
				exchange(numbers,i,j);
			}
		}
		for (int num : numbers) {
			System.out.println(num);
		}
	}

	private static void exchange(int[] numbers, int i, int j) {
		int temp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = temp;
	}

}
