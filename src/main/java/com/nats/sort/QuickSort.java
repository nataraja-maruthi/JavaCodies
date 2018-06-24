package com.nats.sort;

public class QuickSort {
	
	public static void main(String[] args) {
		int[] numbers= {1,2,3,2,1};
		quickSorting(numbers,0,numbers.length-1);
		for (int num : numbers) {
			System.out.println(num);
		}
	}
	
	public static void quickSorting(int[] number, int low, int high) {
		if (low<high) {
			int pivot = partition(number, low, high);
			quickSorting(number, low, pivot-1);
			quickSorting(number, pivot+1, high);
		}
	}
	
	private static int partition(int[] number, int low, int high) {
		int pivot = number[low];
		int i = low +1;
		int j = high;
		while (i<j) {
		    while (number[i]<=number[pivot]) {
				i++;
			}	
		    while (number[j]>=number[pivot]) {
				j--;
			}
		    if (i<j) {
				exchange(number, i, j);	
				i++;j--;
			}
		
		}
		exchange(number, pivot, j);
		return j;
	}

	private static void quickSort(int[] numbers,int low, int high) {
		int i = low, j=high;
		while (i <= j) {
			int pivot = (low+high)/2;
			while (numbers[i]<numbers[pivot]) {
				i++;
			}
			while (numbers[j] > numbers[pivot]) {
				j--;
			}
			if (i <=j) {
				exchange(numbers,i, j);
				i++;
				j--;
			}
		}
		if (i<high ) {
			quickSort(numbers,i, high);
		}
		if (j>low) {
			quickSort(numbers,low, j);
		}
		
	}
	
	private static void exchange(int [] numbers,int i, int j) {
		int temp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = temp;
	}
	

}
